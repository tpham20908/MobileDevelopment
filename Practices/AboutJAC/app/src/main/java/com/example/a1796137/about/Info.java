package com.example.a1796137.about;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Info extends AppCompatActivity {
    TextView infoTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        infoTv = findViewById(R.id.infoTv);

        infoTv.setText(
                "Postal Address:\n" +
                "\n" +
                "21 275 Lakeshore Road\n" +
                "Sainte-Anne-de-Bellevue, Québec\n" +
                "H9X 3L9 Canada\n" +
                "\n" +
                "Contact Information:\n" +
                "\n" +
                "Phone Number: 514-457-6610\n" +
                "Fax Number: 514-457-4730"
        );
    }
}
