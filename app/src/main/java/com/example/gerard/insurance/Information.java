package com.example.gerard.insurance;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Information extends AppCompatActivity {


    EditText name_field, surname_field, gender_field, spouse_name_field, spouse_surname_field;

        String name;
        String surname;
        int identity_no;


    public Information(){
            name = null;
            surname = null;
            identity_no = 0;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent mIntent = getIntent();
        int id = mIntent.getIntExtra("button", 0);

        if (id == R.id.houseBtn) {
            setContentView(R.layout.house);

            Button submit_button = (Button) findViewById(R.id.submit_button);

            submit_button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    final SpouseInformation spouse = new SpouseInformation();
                    // Information information = new Information();

                    name_field = (EditText) findViewById(R.id.name_field);
                    name = name_field.getText().toString();

                    surname_field = (EditText) findViewById(R.id.surname_field);
                    surname = surname_field.getText().toString();

                    gender_field = (EditText) findViewById(R.id.gender_field);
                    spouse.gender = gender_field.getText().toString();


                    spouse_name_field = (EditText) findViewById(R.id.spouse_name_field);
                    spouse.spouse_name = surname_field.getText().toString();

                    spouse_surname_field = (EditText) findViewById(R.id.spouse_surname_field);
                    spouse.spouse_surname = surname_field.getText().toString();

                    setSurname(surname);
                    //spouse.setIdentity_no();
                    setName(name);
                    spouse.setGender(spouse.gender);
                    spouse.setName(spouse.spouse_name);
                    spouse.setSurname(spouse.spouse_surname);
                    //spouse.setDate();

                }
            });
        }else if(id == R.id.carBtn){
            setContentView(R.layout.car_personal_info);

            Button submit_button = (Button) findViewById(R.id.submit_button);

            submit_button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    Intent myIntent = new Intent(Information.this, Car_Info.class);
                    //myIntent.putExtra("button", view.getId());
                    Information.this.startActivity(myIntent);


                }
            });
        }else if(id == R.id.healthBtn){
            setContentView(R.layout.car_personal_info);
        }
    }



    public Information( String name, String surname,int identity_no){


            this.identity_no = identity_no;
            this.name = name;
            this.surname = surname;

    }



    public void checkID () {

       // name_field.setVisibility(View.GONE);

        }

        public String getName () {

            return name;

        }

        public String getSurname () {
            return surname;
        }

        public int getIdentity_no () {
            return identity_no;
        }

        public void setName (String name){
            name = name;
        }

        public void setSurname (String surname){
            surname = surname;
        }

        public void setIdentity_no ( int identity_no){
            identity_no = identity_no;
        }



    }
