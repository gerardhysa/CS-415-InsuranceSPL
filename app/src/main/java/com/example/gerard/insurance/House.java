package com.example.gerard.insurance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class House extends AppCompatActivity {

    int houseId;
    int floors;
    int area;


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
