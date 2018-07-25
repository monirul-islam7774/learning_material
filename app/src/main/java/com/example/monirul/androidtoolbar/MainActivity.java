package com.example.monirul.androidtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Home page");
        toolbar.setSubtitle("Welcome to home");
        toolbar.setNavigationIcon(R.drawable.ic_launcher_foreground);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);*/

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id= item.getItemId();

        switch (id){

            case R.id.action_settings:

                Toast.makeText(MainActivity.this,"Settings clicked",Toast.LENGTH_LONG).show();
                break;

            case R.id.action_camera:

                Toast.makeText(MainActivity.this,"Camera clicked",Toast.LENGTH_LONG).show();
                break;

            case R.id.action_logout:

                Toast.makeText(MainActivity.this,"Logout clicked",Toast.LENGTH_LONG).show();
                break;

            case R.id.action_delete:

                Toast.makeText(MainActivity.this,"Delete clicked",Toast.LENGTH_LONG).show();
                break;

            case R.id.action_refresh:

                Toast.makeText(MainActivity.this,"Refresh clicked",Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
