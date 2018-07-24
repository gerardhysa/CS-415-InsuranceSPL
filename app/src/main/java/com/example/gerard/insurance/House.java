package com.example.gerard.insurance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class House extends AppCompatActivity {

    int houseId;
    int floors;
    int area;


    public House(){}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.house_activity);

        Button btn1 = findViewById(R.id.pay_crypto_button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(House.this, Payment.class);
                startActivity(i);
            }
        });


    }



    public House(int id){

        this.houseId = id;
    }

    public int getID(){
        return houseId;
    }

    public int getFloors(){
        return floors;
    }

    public int getArea(){
        return area;
    }
}
