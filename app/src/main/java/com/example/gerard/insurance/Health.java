package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Health extends AppCompatActivity {

    public void init(){
        Button btn1, btn2;
        btn1 = (Button)findViewById(R.id.bckBtn);
        btn2 = (Button)findViewById(R.id.pay_crypto_button);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Health.this, Payment.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_activity);

        init();
    }

}
