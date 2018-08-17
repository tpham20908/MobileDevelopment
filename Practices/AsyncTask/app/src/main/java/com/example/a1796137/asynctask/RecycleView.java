package com.example.a1796137.asynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecycleView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        initRecyclerView();
    }

    public void initRecyclerView() {
        RecyclerView myRcView = findViewById(R.id.rc_view);
        UserAdapter userAdapter = new UserAdapter();

        myRcView.setAdapter(userAdapter);
        myRcView.setLayoutManager(new LinearLayoutManager(this));
    }
}
