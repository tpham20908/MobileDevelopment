package com.example.a1796137.relativelayoutex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    //ArrayList<String> listItems = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        String[] listItems = {"sdfjkl", "sdffjkl", "dasfjlk", "weofiu"};

        adapter = new ArrayAdapter<String>(this, R.layout.listview_layout_ex1, listItems);

        lv.setAdapter(adapter);

    }
}
