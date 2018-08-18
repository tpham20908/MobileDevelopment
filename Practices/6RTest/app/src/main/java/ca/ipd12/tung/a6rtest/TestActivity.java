package ca.ipd12.tung.a6rtest;

import android.content.res.ColorStateList;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.facebook.stetho.Stetho;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestActivity extends MutualMenu {

    private DbHelper dbHelper;
    private List<Question> questionList;

    private TextView tvEmail;
    private TextView tvScore;
    private TextView tvQuestionCount;
    private TextView tvCountdown;
    private TextView tvQuestion;
    private RadioGroup radioBtnGroup;
    private RadioButton radioBtn1;
    private RadioButton radioBtn2;
    private RadioButton radioBtn3;
    private RadioButton radioBtn4;
    private Button btnConfirm;

    private ColorStateList textColorDefaultBtn;

    private String email;
    private int score;
    private int questionCounter;
    private int questionCountTotal;
    private Question currentQuestion;
    private boolean answered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Stetho.initializeWithDefaults(this);

        // get and store email and score from starting screen activity
        email = getIntent().getStringExtra("email");
        getIntent().getIntExtra("score", score);

        // binding elements-variables
        tvEmail = findViewById(R.id.tv_email);
        tvEmail.append(" " + email);
        tvScore = findViewById(R.id.tv_score);
        tvScore.append(" " + score);

        tvQuestionCount = findViewById(R.id.tv_question_count);
        tvCountdown = findViewById(R.id.tv_countdown);
        tvQuestion = findViewById(R.id.tv_question);
        radioBtnGroup = findViewById(R.id.radio_group);
        radioBtn1 = findViewById(R.id.radio_btn1);
        radioBtn2 = findViewById(R.id.radio_btn2);
        radioBtn3 = findViewById(R.id.radio_btn3);
        radioBtn4 = findViewById(R.id.radio_btn4);
        btnConfirm = findViewById(R.id.btn_confirm);

        dbHelper = new DbHelper(this);
        questionList = dbHelper.getQuestionList();
        // questionList = new ArrayList<>();
        // setUpQuestionList();

        textColorDefaultBtn = radioBtn1.getTextColors();
        questionCountTotal = questionList.size();

        Collections.shuffle(questionList);

        showNextQuestion();
    }

    private void showNextQuestion() {
        radioBtn1.setTextColor(textColorDefaultBtn);
        radioBtn2.setTextColor(textColorDefaultBtn);
        radioBtn3.setTextColor(textColorDefaultBtn);
        radioBtn4.setTextColor(textColorDefaultBtn);
        radioBtnGroup.clearCheck();

        if (questionCounter < questionCountTotal) {
            currentQuestion = questionList.get(questionCounter);

            tvQuestion.setText(currentQuestion.getQuestion());
            radioBtn1.setText(currentQuestion.getOption1());
            radioBtn2.setText(currentQuestion.getOption2());
            radioBtn3.setText(currentQuestion.getOption3());
            radioBtn4.setText(currentQuestion.getOption4());

            questionCounter++;
            tvQuestionCount.append(" " + questionCounter + "/" + questionCountTotal);
            answered = false;
        } else {
            finishTest();
        }
    }

    private void finishTest() {
        finish();
    }

    public void setUpQuestionList() {
        URL apiUrl;
        try {
            apiUrl = new URL("https://oayptvvg0a.execute-api.us-east-1.amazonaws.com/dev/quiz1");
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
            JSONArray jsonarray = null;
            try {
                 jsonarray = new JSONArray(s);
                for (int i = 0; i < jsonarray.length(); i++) {
                    JSONObject jsonobject = jsonarray.getJSONObject(i);
                    String question = jsonobject.getString("question");
                    String option1 = jsonobject.getString("option1");
                    String option2 = jsonobject.getString("option2");
                    String option3 = jsonobject.getString("option3");
                    String option4 = jsonobject.getString("option4");
                    int answerNr = jsonobject.getInt("answerNr");

                    Question q = new Question();
                    q.setQuestion(question);
                    q.setOption1(option1);
                    q.setOption2(option2);
                    q.setOption3(option3);
                    q.setOption4(option4);
                    q.setAnswerNr(answerNr);

                    questionList.add(q);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
