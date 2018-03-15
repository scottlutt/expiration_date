package com.company;

import java.util.ArrayList;

public class Patient {

    private String name;
    private Disease disease;

    public Patient(String name, Disease disease)
    {
        this.name = name;
        this.disease = disease;
    }

    public int getNumTurns()
    {
        int turn = disease.getNumTurns();
        return turn;
    }

    public int decNumTurns(int i)
    {
        return i-1;
    }


    @Override
    public String toString()
    {
        return "Patient Name: " +name+ " Disease: " +disease.getName() + " Turns:" + disease.getNumTurns();
    }



}
