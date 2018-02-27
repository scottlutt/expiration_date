package com.company;

public class Facilities {

    private String name;
    private int numBeds;

    public Facilities(String name, int numBeds)
    {
        this.name = name;
        this.numBeds = numBeds;
    }

    @Override
    public String toString()
    {
        return "Facility name: " + this.name + "     Number of Beds: " + this.numBeds;
    }

}
