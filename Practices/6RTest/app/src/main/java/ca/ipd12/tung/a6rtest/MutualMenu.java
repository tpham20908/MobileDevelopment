package ca.ipd12.tung.a6rtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.zip.Inflater;

public class MutualMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutual_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.start:
                goToStartingScreenActivity();
                break;
            case R.id.history:
                goToHistoryActivity();
                break;
        }
        return true;
    }

    private void goToStartingScreenActivity() {
        Intent starting = new Intent(this, StartingScreenActivity.class);
        startActivity(starting);
    }

    private void goToHistoryActivity() {
        Intent history = new Intent(this, History.class);
        startActivity(history);
    }
}
