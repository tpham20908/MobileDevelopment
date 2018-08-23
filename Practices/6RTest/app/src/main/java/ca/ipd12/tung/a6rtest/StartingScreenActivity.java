package ca.ipd12.tung.a6rtest;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import android.widget.AdapterView.OnItemSelectedListener;

public class StartingScreenActivity extends MutualMenu {
    String strResponse;
    FetchDataFromApi fetchDataFromApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);

        fetchDataFromApi = new FetchDataFromApi();

        URL apiUrl = null;
        try {
            apiUrl = new URL("https://oayptvvg0a.execute-api.us-east-1.amazonaws.com/dev/quiz1");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        fetchDataFromApi.execute(apiUrl);
    }
    public void startingTest(View view) {
        EditText etEmail = findViewById(R.id.email_input);
        String email = etEmail.getText() + "";

        // evaluate email
        if (!matchPattern(email)) {
            Toast.makeText(StartingScreenActivity.this,"Invalid email address!",Toast.LENGTH_LONG).show();
        } else {
            goToTest(email);
        }
    }

    public boolean matchPattern(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }

    public void goToTest(String email) {
        Intent testActivity = new Intent(StartingScreenActivity.this, TestActivity.class);
        // testActivity.putExtra("email", email);
        testActivity.putExtra("strResponse", strResponse);
        startActivity(testActivity);
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
            strResponse = s;
        }
    }
}
