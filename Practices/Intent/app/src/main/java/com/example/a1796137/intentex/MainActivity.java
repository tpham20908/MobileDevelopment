package com.example.a1796137.intentex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSecondActivity(View view) {
        Intent intentToStartActivity = new Intent(MainActivity.this, Main2Activity.class);
        intentToStartActivity.putExtra(Intent.EXTRA_TEXT, "Extra text");
        startActivity(intentToStartActivity);
    }

    public void goToMyWebsite(View view) {
        Uri uri = Uri.parse("https://www.google.ca/");
        Intent openMyWebsite = new Intent(Intent.ACTION_VIEW, uri);
        if (openMyWebsite.resolveActivity((getPackageManager())) != null) {
            startActivity(openMyWebsite);
        }
    }
}
