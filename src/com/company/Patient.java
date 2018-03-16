package com.company;

import java.util.ArrayList;

public class Patient {

    private String name;
    private Disease disease;
    private int patientTurns;

    public Patient(String name, Disease disease)
    {
        this.name = name;
        this.disease = disease;
        patientTurns = disease.getNumTurns();
    }

    public int getNumTurns()
    {
        int turn = disease.getNumTurns();
        return turn;
    }

    public void decNumTurns()
    {
        patientTurns--;
    }


    @Override
    public String toString()
    {
        return "Patient Name: " +name+ " Disease: " +disease.getName() + " Turns:" + patientTurns +"\n";
    }



}
