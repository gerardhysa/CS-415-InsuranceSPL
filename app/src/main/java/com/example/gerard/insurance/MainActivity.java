package com.example.gerard.insurance;

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


            }
        });

        carBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        houseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView txt;
                House house = new House(R.id.healthBtn);
                int ID =  house.getID();
                //System.out.println(ID);
                setContentView(R.layout.house);

                txt = (TextView) findViewById(R.id.txt);




            }
        });

    }
}
