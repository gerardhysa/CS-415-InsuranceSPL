package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

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
        final EditText height_field = (EditText) findViewById(R.id.height_input);
        final EditText weight_field = (EditText) findViewById(R.id.weight_input);
        final TextView bmi_field = (TextView) findViewById(R.id.bmi);


            submit_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value1 = height_field.getText().toString();
                double height = Double.parseDouble(value1);

                String value2 = weight_field.getText().toString();
                double weight = Double.parseDouble(value2);

                double bmi = calculateBMI(height,weight);

                String bmi_category = categorizeBMI(bmi);

                bmi_field.setText("Your BMI is " +  new DecimalFormat("##.##").format(bmi) + "\n" + bmi_category);

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
        //setContentView(R.layout.medication_timetable);
            Intent i = new Intent(Health_Complications.this, Alarm.class);
            startActivity(i);
        }
    }
    public double calculateBMI(double height, double weight){
        double bmi;
        double height_2 = (height * height);
        bmi = weight/height_2;
        return bmi;
    }
    
    public String categorizeBMI(double bmi){
        String bmi_category = "";

        if(bmi <= 18.5){
            bmi_category = "It is less than or equal to 18.5, thus you are underweight.";
        } else if(bmi <= 24.9){
            bmi_category = "It is between 18.5 and 24.9, thus you have normal weight.";
        } else if(bmi <= 29.9){
            bmi_category = "It is between 25 and 29.9, thus you are overweight.";
        } else if(bmi <= 34.9){
            bmi_category = "It is between 30 and 34.9, thus you are class I obese.";
        } else if(bmi <= 39.9){
            bmi_category = "It is between 35 and 39.9, thus you are class II obese.";
        } else if(bmi >= 40){
            bmi_category = "It is greater than or equal to 40, thus you are class I obese.";
        }
        return bmi_category;
    }
}
