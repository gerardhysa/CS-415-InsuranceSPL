package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

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

        // find MenuItem you want to change
        MenuItem nav_camera = menu.findItem(R.id.nav_camera);
        MenuItem nav_gallery = menu.findItem(R.id.nav_gallery);
        MenuItem nav_slideshow = menu.findItem(R.id.nav_slideshow);
        MenuItem nav_share = menu.findItem(R.id.nav_share);
        MenuItem nav_send = menu.findItem(R.id.nav_send);
        MenuItem nav_extra = menu.findItem(R.id.nav_extra);
        // set new title to the MenuItem
        nav_send.setTitle("Insurance Company Appointment");
        nav_send.setIcon(R.drawable.insurance_company);

        if (id == R.id.houseBtn) {

            // set new title to the MenuItem
            nav_camera.setTitle("Buy Insurance");
            iv.setBackgroundResource(R.drawable.house_insurance);
            nav_camera.setIcon(R.drawable.buy_insurance_house);

            // set new title to the MenuItem
            nav_gallery.setTitle("Camera Monitoring");
            nav_gallery.setIcon(R.drawable.camera_monitoring);
            // set new title to the MenuItem
            nav_slideshow.setTitle("House Monitoring");
            nav_slideshow.setIcon(R.drawable.leakage_house);
                       // set new title to the MenuItem
            nav_share.setTitle("Security Office Appointment");
            nav_share.setIcon(R.drawable.security_office);
            // hide
            nav_extra.setVisible(false);

        }else if(id == R.id.carBtn){
            iv.setBackgroundResource(R.drawable.car_insurance);

            // set new title to the MenuItem
            nav_camera.setTitle("Buy Insurance");
            nav_camera.setIcon(R.drawable.buy_insurance_car);

            // set new title to the MenuItem
            nav_gallery.setTitle("Mileage Tracker");
            nav_gallery.setIcon(R.drawable.mileage_tracker);

            // set new title to the MenuItem
            nav_slideshow.setTitle("Maintenance Tracker");
            nav_slideshow.setIcon(R.drawable.maintenance_tracker);

            // set new title to the MenuItem
            nav_share.setTitle("Mechanic Appointment");
            nav_share.setIcon(R.drawable.mechanic);

            // hide
            nav_extra.setVisible(false);

        }else if(id == R.id.healthBtn){

            iv.setBackgroundResource(R.drawable.health_insurance);
            // set new title to the MenuItem
            nav_camera.setTitle("Buy Insurance");
            nav_camera.setIcon(R.drawable.buy_insurance_health);

            // set new title to the MenuItem
            nav_gallery.setTitle("Calculate BMI");
            nav_gallery.setIcon(R.drawable.bmi);

            // set new title to the MenuItem
            nav_slideshow.setTitle("Daily Calorie Intake");
            nav_slideshow.setIcon(R.drawable.calorie);

            // set new title to the MenuItem
            nav_extra.setTitle("Medication Timetable");
            nav_extra.setIcon(R.drawable.medication);

            // set new title to the MenuItem
            nav_share.setTitle("Doctor Appointment");
            nav_share.setIcon(R.drawable.doctor);

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
        } else if (id_navigation == R.id.nav_gallery && id == R.id.healthBtn) {
            Intent i = new Intent(NavigationActivity.this, Health_Complications.class);
            i.putExtra("health", R.id.nav_gallery);
            startActivity(i);
        } else if (id_navigation == R.id.nav_slideshow && id == R.id.healthBtn) {
            Intent i = new Intent(NavigationActivity.this, Health_Complications.class);
            i.putExtra("health", R.id.nav_slideshow);
            startActivity(i);
        } else if (id_navigation == R.id.nav_extra && id == R.id.healthBtn) {
            Intent i = new Intent(NavigationActivity.this, Health_Complications.class);
            i.putExtra("health", R.id.nav_extra);
            startActivity(i);
        } else if (id_navigation == R.id.nav_share && id == R.id.healthBtn) {
            Intent i = new Intent(NavigationActivity.this, Appointment.class);
            i.putExtra("appointment", R.id.nav_share);
            i.putExtra("button", R.id.healthBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_gallery && id == R.id.houseBtn) {
            Intent i = new Intent(NavigationActivity.this, CameraListActivity.class);
            i.putExtra("monitor", R.id.nav_gallery);
            i.putExtra("button", R.id.houseBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_slideshow && id == R.id.houseBtn) {
            Intent i = new Intent(NavigationActivity.this, Monitor.class);
            i.putExtra("monitor", R.id.nav_slideshow);
            i.putExtra("button", R.id.houseBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_share && id == R.id.carBtn) {
            Intent i = new Intent(NavigationActivity.this, Appointment.class);
            i.putExtra("appointment", R.id.nav_share);
            i.putExtra("button", R.id.carBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_share && id == R.id.houseBtn) {
            Intent i = new Intent(NavigationActivity.this, Appointment.class);
            i.putExtra("appointment", R.id.nav_share);
            i.putExtra("button", R.id.houseBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_gallery && id == R.id.carBtn) {
            Intent i = new Intent(NavigationActivity.this, MileageActivity.class);
            i.putExtra("appointment", R.id.nav_gallery);
            i.putExtra("button", R.id.carBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_slideshow && id == R.id.carBtn) {
            Intent i = new Intent(NavigationActivity.this, MaintenanceActivity.class);
            i.putExtra("appointment", R.id.nav_slideshow);
            i.putExtra("button", R.id.carBtn);
            startActivity(i);
        } else if (id_navigation == R.id.nav_send) {
            Intent i = new Intent(NavigationActivity.this, Appointment.class);
            i.putExtra("appointment", R.id.nav_send);
            startActivity(i);
        } else if (id_navigation == R.id.action_settings) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
