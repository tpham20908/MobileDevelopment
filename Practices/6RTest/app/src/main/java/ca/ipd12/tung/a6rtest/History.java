package ca.ipd12.tung.a6rtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class History extends MutualMenu {
    private DbHelper dbHelper;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        dbHelper = new DbHelper(this);
        initRecyclerView();
    }


    public void initRecyclerView() {
        // String[] fruits = {"Apple", "Banana", "Carrot", "Mango", "Orange"};
        list = dbHelper.getParticipantList();
        RecyclerView myRcView = findViewById(R.id.rc_view);
        UserAdapter userAdapter = new UserAdapter(list);

        myRcView.setAdapter(userAdapter);
        myRcView.setLayoutManager(new LinearLayoutManager(this));
    }
}
