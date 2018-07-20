package com.example.gerard.insurance;

public class Information {


    String name;
    String surname;
    int identity_no;
    int id;




    public  Information(){
        name = null;
        surname = null;
        identity_no = 0;
        id = 0;
    }


    public Information(int id,String name,String surname,int identity_no){

        this.id = id;
        this.identity_no = identity_no;
        this.name = name;
        this.surname = surname;

    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIdentity_no() {
        return identity_no;
    }

    public void setName(String name){
        name = name;
    }

    public void setSurname(String surname){
        surname = surname;
    }

    public  void setIdentity_no(int identity_no){
        identity_no = identity_no;
    }


}
