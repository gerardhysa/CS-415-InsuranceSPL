package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Payment extends AppCompatActivity{

    public void init() {
        final RadioButton card, btc;
        Button btn = (Button) findViewById(R.id.proceedBtn);
        card = (RadioButton) findViewById(R.id.cardBtn);
        btc = (RadioButton) findViewById(R.id.btcBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(card.isChecked()) {
                    Intent i = new Intent(Payment.this, Credit_Card.class);
                    startActivityForResult(i, 0);
                }
                else if(btc.isChecked()) {
                    Intent i = new Intent(Payment.this, Crypto.class);
                    startActivityForResult(i, 0);
                }
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_activity);
        init();
    }
}

