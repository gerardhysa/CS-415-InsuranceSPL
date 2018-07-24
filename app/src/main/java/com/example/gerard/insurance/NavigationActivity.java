package com.example.gerard.insurance;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gerard.insurance.R;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Intent mIntent = getIntent();
        int id = mIntent.getIntExtra("button", 0);

        Menu menu = navigationView.getMenu();

        ImageView iv = (ImageView) findViewById(R.id.img_nav);

        if (id == R.id.houseBtn) {

            // find MenuItem you want to change
            MenuItem nav_camera = menu.findItem(R.id.nav_camera);

            // set new title to the MenuItem
            nav_camera.setTitle("Buy Insurance");
            iv.setImageResource(R.mipmap.house_image);

        }else if(id == R.id.carBtn){

            MenuItem nav_camera = menu.findItem(R.id.nav_camera);

            // set new title to the MenuItem
            nav_camera.setTitle("Buy Insurance");


        }else if(id == R.id.healthBtn){

            MenuItem nav_camera = menu.findItem(R.id.nav_camera);

            // set new title to the MenuItem
            nav_camera.setTitle("Buy Insurance");

        }


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id_navigation = item.getItemId();

        Intent mIntent = getIntent();
        int id = mIntent.getIntExtra("button", 0);

        if (id_navigation == R.id.nav_camera && id == R.id.healthBtn) {
            Intent i = new Intent(NavigationActivity.this, Information.class);
            i.putExtra("button", R.id.healthBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_camera && id == R.id.carBtn) {
            Intent i = new Intent(NavigationActivity.this, Information.class);
            i.putExtra("button", R.id.carBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_camera && id == R.id.houseBtn) {
            Intent i = new Intent(NavigationActivity.this, Information.class);
            i.putExtra("button", R.id.houseBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_share) {

        } else if (id_navigation == R.id.nav_send) {

        } else if (id_navigation == R.id.action_settings) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
