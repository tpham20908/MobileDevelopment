package ca.ipd12.tung.a6rtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class TestActivity extends AppCompatActivity {
    String email;
    int score;
    private DbHelper dbHelper;
    private List<Question> questionList;

    private TextView tvQuestion;
    private TextView tvScore;
    private TextView tvQuestionCount;
    private TextView tvCountdown;
    private RadioGroup radioGroup;
    private RadioButton radioBtn1;
    private RadioButton radioBtn2;
    private RadioButton radioBtn3;
    private RadioButton radioBtn4;
    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        // get and store email and score from starting screen activity
        email = getIntent().getStringExtra("email");
        getIntent().getIntExtra("score", score);
        // binding elements-variables
        tvQuestion = findViewById(R.id.tv_question);
        tvQuestionCount = findViewById(R.id.tv_question_count);
        tvScore = findViewById(R.id.tv_score);
        tvCountdown = findViewById(R.id.tv_countdown);
        radioGroup = findViewById(R.id.radio_group);
        radioBtn1 = findViewById(R.id.radio_btn1);
        radioBtn2 = findViewById(R.id.radio_btn2);
        radioBtn3 = findViewById(R.id.radio_btn3);
        radioBtn4 = findViewById(R.id.radio_btn4);
        btnConfirm = findViewById(R.id.btn_confirm);

        dbHelper = new DbHelper(this);
        questionList = dbHelper.getQuestionList();
    }
}
