package com.example.a1796137.savingtodatabase;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String name, address, phone;
    long rowId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchDataFromDB();
    }

    public void savingData(View view) {
        EditText etName = findViewById(R.id.et_name);
        EditText etAddress = findViewById(R.id.et_address);
        EditText etPhone = findViewById(R.id.et_phone);

        name = etName.getText() + "";
        address = etAddress.getText() + "";
        phone = etPhone.getText() + "";

        if (name == "" || address == "" || phone == "") {
            TextView warning = findViewById(R.id.warning);
            warning.setText("All field are required!!!");
            return;
        }

        // saving info to SQLite
        MyDbHelper dbHelper = new MyDbHelper(this, "usersdb", null, 1);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("address", address);
        values.put("phone", phone);

        rowId = db.insert("user", null, values);

        Log.i("Row Id", rowId + "");


        // emptying inputs
        etName.setText("");
        etAddress.setText("");
        etPhone.setText("");
    }

    public void fetchDataFromDB() {
        MyDbHelper dbHelper = new MyDbHelper(this, "usersdb", null, 1);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] columns = { "name", "address", "phone" };
        Cursor cursor = db.query("user", columns, null, null, null, null, null);

        cursor.moveToFirst();

        for (int idx = 1; idx <= cursor.getCount(); idx++) {

            Log.i("Name", cursor.getString(0));
            Log.i("Address", cursor.getString(1));
            Log.i("Phone", cursor.getString(2));

            cursor.moveToNext();
        }
    }

    public void loggingData(View view) {
        Intent showingInfo = new Intent(MainActivity.this, ShowingInfo.class);
        showingInfo.putExtra("name", name);
        showingInfo.putExtra("address", address);
        showingInfo.putExtra("phone", phone);
        startActivity(showingInfo);

        Log.i("name", name);
        Log.i("address", address);
        Log.i("phone", phone);
    }
}
