package ca.ipd12.tung.a6rtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TestActivity extends AppCompatActivity {
    String email;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        // get and store email and score from starting screen activity
        email = getIntent().getStringExtra("email");
        getIntent().getIntExtra("score", score);
    }
}
