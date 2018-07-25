package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Appointment extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent mIntent = getIntent();
        int id = mIntent.getIntExtra("appointment", 0);
        int id_btn = mIntent.getIntExtra("button",0);

        setContentView(R.layout.appointment);
        EditText type = (EditText) findViewById(R.id.type_of_appointment);
        Button submit_button = (Button) findViewById(R.id.appointment_btn);

        if (id == R.id.nav_share && id_btn == R.id.healthBtn) {

            //setContentView(R.layout.activity_navigation);
            type.setHint("Enter which Doctor you want to see");
            submit_button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    //Intent myIntent = new Intent(Information.this, House.class);
                    //myIntent.putExtra("button", view.getId());
                    //Information.this.startActivity(myIntent);

                }
            });
        } else if(id == R.id.nav_share && id_btn == R.id.houseBtn){
            //type.setHint("Type Reason of Appointment");
        } else if(id == R.id.nav_share && id_btn == R.id.carBtn){
            //type.setHint("Type Reason of Appointment");
        } else  if (id == R.id.nav_send){
            //type.setHint("Type Reason of Appointment");
        }
    }
}
