package com.company;

public class Disease {

    private String name;
    private int ucTurn;
    private int hTurn;
    private int tTurn;

    public Disease(String name, int ucTurn, int hTurn, int tTurn)
    {
        this.name = name;
        this.ucTurn = ucTurn;
        this.hTurn = hTurn;
        this.tTurn = tTurn;
    }

    @Override
    public String toString()
    {
        return "Disease name: " + this.name + "     Urgent Care Turns: " + this.ucTurn + "      Hospital Turns: " + this.hTurn + "      Trauma Turns: " + this.tTurn;
    }
}
