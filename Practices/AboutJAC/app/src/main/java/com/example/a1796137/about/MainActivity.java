package com.example.a1796137.about;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemId = item.getItemId();
        switch (menuItemId) {
            case (R.id.location):
                renderLocation();
            case (R.id.website):
                renderWebsite();
            case (R.id.info):
                renderInfo();
        }

        return true;
    }

    public void renderLocation() {
        // Create a Uri from an intent string. Use the result to create an Intent.
//        Uri jacLocationUri = Uri.parse("geo=45.4064035,-73.9461085?z=15");
        Uri jacLocationUri = Uri.parse("google.streetview:cbll=45.4064035,-73.9461085?z=15");

        // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent jacLocation = new Intent(Intent.ACTION_VIEW, jacLocationUri);

        // Make the Intent explicit by setting the Google Maps package
        jacLocation.setPackage("com.google.android.apps.maps");

        // Attempt to start an activity that can handle the Intent
        if (jacLocation.resolveActivity(getPackageManager()) != null) {
            startActivity(jacLocation);
        }
    }

    public void renderInfo() {
        Intent infoJac = new Intent(MainActivity.this, Info.class);
        // infoJac.putExtra(Intent.EXTRA_TEXT, "Extra text");
        startActivity(infoJac);
    }

    public void renderWebsite() {
        Uri uri = Uri.parse("http://www.johnabbott.qc.ca");
        Intent openJacWebsite = new Intent(Intent.ACTION_VIEW, uri);
        if (openJacWebsite.resolveActivity((getPackageManager())) != null) {
            startActivity(openJacWebsite);
        }
    }
}