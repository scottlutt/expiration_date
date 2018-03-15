package com.company;

public class Simulation extends Main{

    public void play()
    {
        Facilities hospital = new Facilities("Mount Nittany Hospital", 200);
        Facilities urgentCare = new Facilities("Med Express", 50);
        Facilities trauma = new Facilities("Trauma center", 100);
        System.out.println(hospital);

        Disease stroke = new Disease("stroke", 7, hospital);
        Disease heartAttack = new Disease("Heart Attack", 5, trauma);
        Disease flu = new Disease("Flu", 1, urgentCare);
        System.out.println(stroke);
    }

}
