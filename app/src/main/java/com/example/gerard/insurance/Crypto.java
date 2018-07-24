package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Crypto extends Payment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crypto_activity);


        Button pay_button = (Button) findViewById(R.id.pay_crypto_button);

        pay_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(Crypto.this, MainActivity.class);
                //myIntent.putExtra("button", view.getId());
                Crypto.this.startActivity(myIntent);


            }
        });

    }
}
