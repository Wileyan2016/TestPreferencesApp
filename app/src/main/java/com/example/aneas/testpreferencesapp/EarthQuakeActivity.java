package com.example.aneas.testpreferencesapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class EarthQuakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_quake);
//Trying to test on how preferences work.
        SharedPreferences mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String minmax = mySharedPreferences.getString("list_prefkey", "dollar");//get the preference and get the default value?
        Toast.makeText(this, minmax, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_setttings) {
            Intent setttingsIntent = new Intent(this, SettingsActivity.class);
            startActivity(setttingsIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
