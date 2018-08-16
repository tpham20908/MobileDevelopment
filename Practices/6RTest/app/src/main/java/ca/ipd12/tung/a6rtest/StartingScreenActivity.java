package ca.ipd12.tung.a6rtest;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class StartingScreenActivity extends AppCompatActivity {
    HashMap<String, Integer> participants;
    TextView warning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);
        participants = getParticipantsFromDB();
        warning = findViewById(R.id.warning);
    }

    public void startingTest(View view) {
        EditText etEmail = findViewById(R.id.email_input);
        String email = etEmail.getText() + "";

        // evaluate email
        if (!matchPattern(email)) {
            warning.setText("Invalid email address. Please try again");
        }

        // check if email already exists
        if (participants.containsKey(email)) {
            goToTest(email);
        } else {
            creatingNewParticipant(email);
            goToTest(email);
        }

    }

    public boolean matchPattern(String email) {
        return 
    }

    public void goToTest(String email) {

    }

    public void creatingNewParticipant(String email) {
        DbHelper dbHelper = new DbHelper(this, "drivingtestdb", null, 1);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("email", email);
        values.put("score", 0);

        Long rowId = db.insert("participants", null, values);

        Log.i("RowId", rowId + "");
    }

    public HashMap<String, Integer> getParticipantsFromDB() {
        // instantiate participants HashMap object to store list of participants' info
        HashMap<String, Integer> participants = new HashMap<>();

        DbHelper dbHelper = new DbHelper(this, "drivingtestdb", null, 1);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] columns = { "email", "score" };
        Cursor cursor = db.query("participants", columns, null, null,
                null, null, null);
        // move cursor to the first row
        cursor.moveToFirst();

        for (int idx = 1; idx <= cursor.getCount(); idx++) {
            // store info into participants
            participants.put(cursor.getString(0), cursor.getInt(1));
            // move cursor to next row
            cursor.moveToNext();
        }

        return participants;
    }
}
