package com.example.gerard.insurance;

import java.util.Date;

public class SpouseInformation extends Information {

    String gender;
    Date birth;
    String spouse_name;
    String spouse_surname;

    public SpouseInformation(){
         gender = null;
         birth = null;
    }

    public SpouseInformation(String gender, Date birth){

        this.gender = gender;
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public String getGender() {
        return gender;
    }

    public  void setGender(String gender){
        gender = gender;
    }

    public  void setDate(Date date){
        date = date;
    }
}