package com.example.gerard.insurance;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Car_Info extends AppCompatActivity implements AlertDialogRadio.AlertPositiveListener{


        int position = 0;
        public void init(){
            Button btn1, btn2;
            btn1 = (Button)findViewById(R.id.bckBtn);
           btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Car_Info.this, MainActivity.class);
                    startActivity(i);
                }
            });

        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.car_info_activity);

            init();
            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    /** Getting the fragment manager */
                    FragmentManager manager = getFragmentManager();

                    /** Instantiating the DialogFragment class */
                    AlertDialogRadio alert = new AlertDialogRadio();

                    /** Creating a bundle object to store the selected item's index */
                    Bundle b  = new Bundle();

                    /** Storing the selected item's index in the bundle object */
                    b.putInt("position", position);

                    /** Setting the bundle object to the dialog fragment object */
                    alert.setArguments(b);

                    /** Creating the dialog fragment object, which will in turn open the alert dialog window */
                    alert.show(manager, "alert_dialog_radio");
                }
            };

            /** Getting the reference of the button from the main layout */
            Button btn = (Button) findViewById(R.id.prcdBtn);

            /** Setting a button click listener for the choose button */
            btn.setOnClickListener(listener);
        }

        @Override
        public void onPositiveClick(int position) {
            this.position = position;
            Intent i = new Intent(Car_Info.this, Payment.class);
            startActivity(i);
        }
    }



