package com.company;

public class Simulation extends Main{

    public void play()
    {
        Facilities hospital = new Facilities("Mount Nittany Hospital", 200, "Hospital");
        Facilities urgentCare = new Facilities("Med Express", 50, "Urgent Care");
        Facilities trauma = new Facilities("Trauma center", 100, "Trauma");

        Disease stroke = new Disease("stroke", 7, hospital);
        Disease heartAttack = new Disease("Heart Attack", 5, trauma);
        Disease flu = new Disease("Flu", 1, urgentCare);

        //System.out.println(hospital);
        System.out.println(stroke+ " "+stroke.getCorrectLocation(hospital));
    }

}
