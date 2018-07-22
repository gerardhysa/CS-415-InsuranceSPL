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
                final Information info = new Information(R.id.houseBtn);
                //info.checkID();

                System.out.println(info.getId());


                Intent myIntent = new Intent(MainActivity.this, Information.class);
                MainActivity.this.startActivity(myIntent);


                // final House house = new House(R.id.houseBtn);

                //
                //  submit_button.setOnClickListener( new View.OnClickListener(){

                // private TextView name, surname,gender;

                //   @Override
                //  public void onClick(View view) {
                //       setContentView(R.layout.test);



                      /* String name_info =  info.getName();
                       String surname_info = info.getSurname();

                        name.setText(name_info);

                        surname.setText(surname_info);*/
                // }
                // });
                // setContentView(R.layout.house);

                // });


                //});

            }
        });
    }
}
