package com.company;

public class Facilities {

    private String name;
    private int numBeds;
    private String facility;

    public Facilities(String name, int numBeds, String facility)
    {
        this.name = name;
        this.numBeds = numBeds;
        this.facility = facility;
    }

    public String getFacility() {
        return facility;
    }

    public void decNumBeds()
    {
        numBeds--;
    }

    @Override
    public String toString()
    {
        return "Facility name: " + this.name + "     Number of Beds: " + this.numBeds;
    }

}
