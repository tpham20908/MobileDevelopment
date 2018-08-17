package com.example.a1796137.asynctask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {

    ArrayList<String> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        arr = new ArrayList<>();
        getData();

        initRecyclerView();
    }

    public void initRecyclerView() {
        // String[] fruits = {"asdfd", "fsdfa", "sdff", "wrwe", "werasdf", "qwew", "afsdas", "asdfasdfwer", "fsdawei", "efddsfj"};
        RecyclerView myRcView = findViewById(R.id.rc_view);
        UserAdapter userAdapter = new UserAdapter(arr);

        myRcView.setAdapter(userAdapter);
        myRcView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void getData() {
        URL apiUrl;
        try {
            apiUrl = new URL("https://jsonplaceholder.typicode.com/todos");
            new FetchDataFromApi().execute(apiUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public class FetchDataFromApi extends AsyncTask<URL, Void, String> {
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
            try {
                JSONArray jsonarray = new JSONArray(s);
                for (int i = 0; i < jsonarray.length(); i++) {
                    JSONObject jsonobject = jsonarray.getJSONObject(i);
                    String title = jsonobject.getString("title");
                    arr.add(title);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
