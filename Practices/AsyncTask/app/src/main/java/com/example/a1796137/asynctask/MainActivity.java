package com.example.a1796137.asynctask;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FetchDataFromApi fetchDataFromApi;
    ArrayList<Question> questionList;
    ArrayList<String> arr;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        URL apiUrl = null;
        try {
            apiUrl = new URL("https://oayptvvg0a.execute-api.us-east-1.amazonaws.com/dev/quiz1");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        fetchDataFromApi = new FetchDataFromApi();
        fetchDataFromApi.execute(apiUrl);
    }

    public void goToMain2Activity(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("str", str);
        startActivity(intent);
    }

    public void getData(View view) {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
        URL apiUrl;
        try {
            //apiUrl = new URL("https://jsonplaceholder.typicode.com/todos");
            apiUrl = new URL("https://oayptvvg0a.execute-api.us-east-1.amazonaws.com/dev/quiz1");
            new FetchDataFromApi().execute(apiUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        //Log.i("questionList",questionList.size() + "");
        //Log.i("arr",arr.size() + "");
        Log.i("str", str);
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
            str = s;
            //TextView tvResult = findViewById(R.id.tvResult);
            //tvResult.setText(str);
        }
    }

    public class Question {
        private String question;
        private String option1;
        private String option2;
        private String option3;
        private String option4;
        private int answerNr;

        public Question() {}

        public Question(String question, String option1, String option2, String option3, String option4, int answerNr) {
            this.question = question;
            this.option1 = option1;
            this.option2 = option2;
            this.option3 = option3;
            this.option4 = option4;
            this.answerNr = answerNr;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getOption1() {
            return option1;
        }

        public void setOption1(String option1) {
            this.option1 = option1;
        }

        public String getOption2() {
            return option2;
        }

        public void setOption2(String option2) {
            this.option2 = option2;
        }

        public String getOption3() {
            return option3;
        }

        public void setOption3(String option3) {
            this.option3 = option3;
        }

        public String getOption4() {
            return option4;
        }

        public void setOption4(String option4) {
            this.option4 = option4;
        }

        public int getAnswerNr() {
            return answerNr;
        }

        public void setAnswerNr(int answerNr) {
            this.answerNr = answerNr;
        }
    }
}
