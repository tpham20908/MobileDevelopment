package ca.ipd12.tung.a6rtest;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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
import java.util.Locale;

public class TestActivity extends MutualMenu {
    public final long COUNTDOWN_IN_MILLIS = 60000;
    public final int NUMBER_OF_QUESTION = 10;
    String strResponse;

    // These variables will be assigned to (View) elements in onCreate
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

    // These variables will be manipulated while running app
    private String email;
    private int score;
    private int questionCounter;
    private int questionCountTotal;
    private boolean answered;
    private Question currentQuestion;
    private DbHelper dbHelper;
    private ArrayList<Question> questionList;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;
    private ColorStateList textColorDefaultBtn;
    private ColorStateList textColorDefaultCd;

    // These variables will be used on onSaveInstanceState
    public final String KEY_SCORE = "keyScore";
    public final String KEY_QUESTION_COUNTER = "keyQuestionCounter";
    public final String KEY_TIME_LEFT_IN_MILLIS = "keyTimeLeftInMillis";
    public final String KEY_ANSWERED = "keyAnswer";
    public final String KEY_QUESTION_LIST = "keyQuestionList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Stetho.initializeWithDefaults(this);

        // get and store email and api response string from starting screen activity
        email = getIntent().getStringExtra("email");
        score = 0;
        strResponse = getIntent().getStringExtra("strResponse");

        // binding elements-variables
        tvEmail = findViewById(R.id.tv_email);
        tvEmail.append(" " + email);
        tvScore = findViewById(R.id.tv_score);

        tvQuestionCount = findViewById(R.id.tv_question_count);
        tvCountdown = findViewById(R.id.tv_countdown);
        tvQuestion = findViewById(R.id.tv_question);
        radioBtnGroup = findViewById(R.id.radio_group);
        radioBtn1 = findViewById(R.id.radio_btn1);
        radioBtn2 = findViewById(R.id.radio_btn2);
        radioBtn3 = findViewById(R.id.radio_btn3);
        radioBtn4 = findViewById(R.id.radio_btn4);
        btnConfirm = findViewById(R.id.btn_confirm);
        textColorDefaultBtn = radioBtn1.getTextColors();
        textColorDefaultCd = tvCountdown.getTextColors();

        dbHelper = new DbHelper(this);
        //questionList = dbHelper.getQuestionList();
        questionList = new ArrayList<Question>();

        // handle device rotation case
        if (savedInstanceState == null) {
            setUpQuestionList(strResponse);
            Collections.shuffle(questionList);
            //questionList = new ArrayList<>(questionList.subList(0, NUMBER_OF_QUESTION));
            questionCountTotal = questionList.size();
            showNextQuestion();
        } else {
            questionList = savedInstanceState.getParcelableArrayList(KEY_QUESTION_LIST);
            questionCountTotal = questionList.size();
            questionCounter = savedInstanceState.getInt(KEY_QUESTION_COUNTER);
            currentQuestion = questionList.get(questionCounter - 1);
            score = savedInstanceState.getInt(KEY_SCORE);
            timeLeftInMillis = savedInstanceState.getLong(KEY_TIME_LEFT_IN_MILLIS);
            answered = savedInstanceState.getBoolean(KEY_ANSWERED);

            if (!answered) {
                startCountDown();
            } else {
                updateCountDownText();
                showSolution();
            }
        }
    }

    public void clickConfirm(View view) {
        if (!answered) {
            if (radioBtn1.isChecked() || radioBtn2.isChecked()
                    || radioBtn3.isChecked() || radioBtn4.isChecked()) {
                checkAnswer();
            } else {
                Toast.makeText(TestActivity.this, "Please select an answer",
                        Toast.LENGTH_LONG).show();
            }
        } else {
            showNextQuestion();
        }
    }

    private void checkAnswer() {
        answered = true;
        countDownTimer.cancel();

        RadioButton rbSelected = findViewById(radioBtnGroup.getCheckedRadioButtonId());
        int answerNr = radioBtnGroup.indexOfChild(rbSelected) + 1;

        if (answerNr == currentQuestion.getAnswerNr()) {
            score++;
            tvScore.setText("Score: " + score);
        }

        showSolution();
    }

    private void showSolution() {
        radioBtn1.setTextColor(Color.RED);
        radioBtn2.setTextColor(Color.RED);
        radioBtn3.setTextColor(Color.RED);
        radioBtn4.setTextColor(Color.RED);

        switch (currentQuestion.getAnswerNr()) {
            case 1:
                radioBtn1.setTextColor(Color.GREEN);
                tvQuestion.setText("Answer 1 is correct");
                break;
            case 2:
                radioBtn2.setTextColor(Color.GREEN);
                tvQuestion.setText("Answer 2 is correct");
                break;
            case 3:
                radioBtn3.setTextColor(Color.GREEN);
                tvQuestion.setText("Answer 3 is correct");
                break;
            case 4:
                radioBtn4.setTextColor(Color.GREEN);
                tvQuestion.setText("Answer 4 is correct");
                break;
        }

        if (questionCounter < questionCountTotal) {
            btnConfirm.setText("Next");
        } else {
            btnConfirm.setText("Finish");
        }
    }

    private void showNextQuestion() {
        timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        startCountDown();

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
            tvQuestionCount.setText("Question: " + questionCounter + "/" + questionCountTotal);
            answered = false;
        } else {
            finishTest();
        }
    }

    private void startCountDown() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftInMillis = l;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText();
                checkAnswer();
            }
        }.start();
    }

    private void updateCountDownText() {
        int seconds = (int) (timeLeftInMillis / 1000) % 60;
        String timeFormatted = String.format(Locale.getDefault(), "00:%02d", seconds);
        tvCountdown.setText(timeFormatted);

        if ((timeLeftInMillis < 10000)) {
            tvCountdown.setTextColor(Color.RED);
        } else {
            tvCountdown.setTextColor(textColorDefaultCd);
        }
    }

    private void finishTest() {
        dbHelper.addParticipant(new Participant(email, score));
        // sendEmailToParticipant();
        finish();
    }

    public void quitTest(View view) {
        dbHelper.addParticipant(new Participant(email, score));
        //sendEmailToParticipant();
        System.exit(0);
    }

    private void sendEmailToParticipant() {
        /*
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {email});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Result on 6RTest");
        intent.putExtra(Intent.EXTRA_TEXT, "You scored " + score + " on 6RTest app.\nThank you for participating!!");
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));
        */

    }

    public void setUpQuestionList(String strResponse) {
        JSONArray jsonarray = null;
        try {
            jsonarray = new JSONArray(strResponse);
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

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_SCORE, score);
        outState.putInt(KEY_QUESTION_COUNTER, questionCounter);
        outState.putLong(KEY_TIME_LEFT_IN_MILLIS, timeLeftInMillis);
        outState.putBoolean(KEY_ANSWERED, answered);
        outState.putParcelableArrayList(KEY_QUESTION_LIST, questionList);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        if (dbHelper != null) {
            dbHelper.close();
        }
    }
}
