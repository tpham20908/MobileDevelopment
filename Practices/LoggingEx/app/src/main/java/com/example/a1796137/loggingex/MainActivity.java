package com.example.a1796137.loggingex;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        if (savedInstanceState != null) {
            String mState = savedInstanceState.getString("key1");
            // text.setText(mState);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("key1", "This is a text called on onSaveInstanceState");
        outState.putString("key2", "This is a second text called on onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String text1 = savedInstanceState.getString("key1");
        text.setText(text1);
    }
}
