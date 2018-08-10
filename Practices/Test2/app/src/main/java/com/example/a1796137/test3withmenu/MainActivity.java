package com.example.a1796137.test3withmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView text = findViewById(R.id.text);
        Random r = new Random();
        int studentId = r.nextInt(100) + 1796100;
        String studentName = "Myname " + studentId;
        String address = "123 Main Street";

        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.Item1:
                text.setText(R.id.Item1 + "");
                break;

            case R.id.Item2:
                text.setText(R.id.Item2 + "");
                break;

            case R.id.Item3:
                text.setText(R.id.Item3 + "");
                break;

            case R.id.studentId:
                text.setText("Student ID: " + studentId);
                break;

            case R.id.studentName:
                text.setText(studentName + ", Address: " + address);
                break;
        }

        return true;
    }
}
