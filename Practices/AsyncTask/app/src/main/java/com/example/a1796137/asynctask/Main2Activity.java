package com.example.a1796137.asynctask;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main2Activity extends AppCompatActivity implements AsyncResponse {
    FetchDataFromApi fetchDataFromApi;
    URL apiUrl;
    String strFromIntent;
    String str;
    String str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        strFromIntent = getIntent().getStringExtra("str");
        Log.i("str", strFromIntent);

        try {
            apiUrl = new URL("https://oayptvvg0a.execute-api.us-east-1.amazonaws.com/dev/quiz1");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        fetchDataFromApi = new FetchDataFromApi();
        fetchDataFromApi.delegate = this;
        fetchDataFromApi.execute(apiUrl);
    }

    @Override
    public void processFinish(String output) {
        str = output;
    }

    public void goToMain3Activity(View view) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        intent.putExtra("str", str2);
        startActivity(intent);
    }

    public class FetchDataFromApi extends AsyncTask<URL, Void, String> {
        public AsyncResponse delegate = null;
        @Override
        protected String doInBackground(URL... urls) {
            URL myUrl = urls[0];
            String response = "";
            try {
                response = NetworkUtility.getResponseFromHttpUrl(myUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return response;
        }
        @Override
        protected void onPostExecute(String s) {
            str2 = s;
            //delegate.processFinish(s);
        }
    }
}
