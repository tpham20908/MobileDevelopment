package ca.ipd12.tung.a6rtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class History extends MutualMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        initRecyclerView();
    }


    public void initRecyclerView() {
        RecyclerView myRcView = findViewById(R.id.rc_view);
        UserAdapter userAdapter = new UserAdapter();

        myRcView.setAdapter(userAdapter);
        myRcView.setLayoutManager(new LinearLayoutManager(this));
    }
}
