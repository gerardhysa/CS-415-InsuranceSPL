package com.example.gerard.insurance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button healthBtn = (Button) findViewById(R.id.healthBtn);
        Button carBtn = (Button) findViewById(R.id.carBtn);
        Button houseBtn = (Button) findViewById(R.id.houseBtn);

        healthBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, NavigationActivity.class);
                myIntent.putExtra("button", view.getId());
                MainActivity.this.startActivity(myIntent);

            }
        });

        carBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent myIntent = new Intent(MainActivity.this, NavigationActivity.class);
                myIntent.putExtra("button", view.getId());
                MainActivity.this.startActivity(myIntent);

            }
        });

        houseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, NavigationActivity.class);
                myIntent.putExtra("button", view.getId());
                MainActivity.this.startActivity(myIntent);


            }
        });
    }
}
