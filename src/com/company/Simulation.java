package com.company;

import java.util.ArrayList;

public class Simulation extends Main{

    public void play()
    {
        ArrayList<Facilities> facList = new ArrayList<Facilities>();
        ArrayList<Disease> disList = new ArrayList<Disease>();


        Facilities hospital = new Facilities("Mount Nittany Hospital", 200, "Hospital");
        Facilities urgentCare = new Facilities("Med Express", 50, "Urgent Care");
        Facilities trauma = new Facilities("Trauma center", 100, "Trauma");

        facList.add(hospital);
        facList.add(urgentCare);
        facList.add(trauma);

        Disease stroke = new Disease("stroke", 7, hospital);
        Disease heartAttack = new Disease("Heart Attack", 5, trauma);
        Disease flu = new Disease("Flu", 1, urgentCare);

        disList.add(stroke);
        disList.add(heartAttack);
        disList.add(flu);

        //System.out.println(hospital);
        System.out.println(stroke+ " "+stroke.getCorrectLocation(hospital));
    }

}
