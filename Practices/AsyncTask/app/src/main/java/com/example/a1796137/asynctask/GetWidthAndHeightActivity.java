package com.example.a1796137.asynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GetWidthAndHeightActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_width_and_height);
        btn1 = findViewById(R.id.btn1);
        btn1.setPadding(12, 14, 10, 10);
        btn2 = findViewById(R.id.btn2);
    }

    public void btn1Clicked(View v) {
        Log.i("get width",btn1.getWidth() + "");
        Log.i("get height",btn1.getHeight() + "");
        Log.i("measure width",btn1.getMeasuredWidth() + "");
        Log.i("measure height",btn1.getMeasuredHeight() + "");
        Log.i("padding left",btn1.getPaddingLeft() + "");
        Log.i("padding right",btn1.getPaddingRight() + "");
        Log.i("padding bottom",btn1.getPaddingBottom() + "");
        Log.i("padding top",btn1.getPaddingTop() + "");
    }

    public void btn2Clicked(View v) {
        Log.i("get width",btn2.getWidth() + "");
        Log.i("get height",btn2.getHeight() + "");
        Log.i("measure width",btn2.getMeasuredWidth() + "");
        Log.i("measure height",btn2.getMeasuredHeight() + "");
    }
}
