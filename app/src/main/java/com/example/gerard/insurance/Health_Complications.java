package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Health_Complications extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent mIntent = getIntent();
        int id = mIntent.getIntExtra("health", 0);

        if (id == R.id.nav_gallery) {

        //setContentView(R.layout.activity_navigation);

        setContentView(R.layout.bmi_calculator);
        Button submit_button = (Button) findViewById(R.id.bmi_btn);

        submit_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Intent myIntent = new Intent(Information.this, House.class);
                //myIntent.putExtra("button", view.getId());
                //Information.this.startActivity(myIntent);
                }
            });
        }else if (id == R.id.nav_slideshow){
            setContentView(R.layout.calorie_intake);
            Button submit_button = (Button) findViewById(R.id.calorie_btn);

            submit_button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    //Intent myIntent = new Intent(Information.this, House.class);
                    //myIntent.putExtra("button", view.getId());
                    //Information.this.startActivity(myIntent);
                }
            });
        }else if (id == R.id.nav_extra){
        setContentView(R.layout.medication_timetable);
        Button submit_button = (Button) findViewById(R.id.medication_btn);

        submit_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Intent myIntent = new Intent(Information.this, House.class);
                //myIntent.putExtra("button", view.getId());
                //Information.this.startActivity(myIntent);
                }
            });
        }
    }
}
