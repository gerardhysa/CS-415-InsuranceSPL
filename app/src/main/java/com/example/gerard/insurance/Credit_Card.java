package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Credit_Card extends Payment{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_activity);

        Button pay_button = (Button) findViewById(R.id.pay_crypto_button);

        pay_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(Credit_Card.this, MainActivity.class);
                //myIntent.putExtra("button", view.getId());
                Credit_Card.this.startActivity(myIntent);


            }
        });

    }
}
