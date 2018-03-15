package com.company;

public class Disease {

    private String name;
    private int numTurns;
    private Facilities correctLocation;
    //private int tTurn;

    public Disease(String name, int numTurns, Facilities correctLocation)
    {
        this.name = name;
        this.numTurns = numTurns;
        this.correctLocation = correctLocation;
        //this.tTurn = tTurn;
    }

    public String getCorrectLocation(Facilities f) {
        return f.getFacility();
    }

    @Override
    public String toString()
    {
        return "Disease name: " + this.name + "     Number of Turns: " + this.numTurns + "      Correct Location: ";
    }
}
