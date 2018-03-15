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

    @Override
    public String toString()
    {
        return "Patient Name: " +name+ "          Disease: " +disease.getName();
    }



}
