package com.example.pilldashboard;


import java.util.ArrayList;

public class Account {
    private String firstName;
    private String lastName;


    private ArrayList<String> drugs = new ArrayList<String>(){
        {
            add("Geeks");
            add("for");
            add("Geeks");
        }
    };

    public ArrayList<String> getDrugs() {
        return drugs;
    }

    Account(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
