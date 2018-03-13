package com.company;

public class Simulation extends Main{
    Facilities hospital = new Facilities("Mount Nittany Hospital", 200);
    Disease stroke = new Disease("stroke", 7, hospital);
}
