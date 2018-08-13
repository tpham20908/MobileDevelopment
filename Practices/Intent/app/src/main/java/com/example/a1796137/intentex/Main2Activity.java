package com.example.a1796137.intentex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView child_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        child_tv = findViewById(R.id.child_tv);
        // fetch intent from previous page
        Intent getIntent = getIntent();

        if (getIntent.hasExtra(Intent.EXTRA_TEXT)) {
            String stringReceived = getIntent.getStringExtra(Intent.EXTRA_TEXT);
            // child_tv.setText(stringReceived);
            child_tv.append(stringReceived);
        }
    }

    public void backToMainActivity(View view) {
        Intent backToPreviousActivity = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(backToPreviousActivity);
    }
}
