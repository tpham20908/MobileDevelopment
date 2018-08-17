package com.example.a1796137.savingtodatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowingInfo extends MutualMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing_info);

        TextView name = findViewById(R.id.name);
        TextView address = findViewById(R.id.address);
        TextView phone = findViewById(R.id.phone);

        String strName = getIntent().getStringExtra("name");
        String strAddress = getIntent().getStringExtra("address");
        String strPhone = getIntent().getStringExtra("phone");

        name.setText("Name: " + strName);
        address.setText("Address: " + strAddress);
        phone.setText("Phone: " + strPhone);
    }
}
