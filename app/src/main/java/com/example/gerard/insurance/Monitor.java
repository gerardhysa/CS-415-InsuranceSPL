package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class Monitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_monitor);
        EditText type = (EditText) findViewById(R.id.type_of_appointment);
        Button submit_button = (Button) findViewById(R.id.appointment_btn);

    }
}
