package ca.ipd12.tung.a6rtest;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class StartingScreenActivity extends MutualMenu {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);
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
        testActivity.putExtra("email", email);
        testActivity.putExtra("score", 0);
        startActivity(testActivity);
    }
}
