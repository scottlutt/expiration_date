package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Simulation extends Main{

    public void play()
    {
        ArrayList<Facilities> facList = new ArrayList<Facilities>();
        ArrayList<Disease> disList = new ArrayList<Disease>();
        ArrayList<Patient> patList = new ArrayList<Patient>();
        String names [];
        names = new String[] {"Michael","Matthew","Jason","Christopher","David","John","Joseph","James","Robert","Joshua","Daniel",
            "Justin","Brian","Ryan","William","Andrew","Thomas","Timothy","Jonathan","Eric","Adam","Kevin","Jeffrey","Richard",
            "Nicholas","Anthony","Mark","Jeremy","Stephen","Scott","Steven","Brandon","Charles","Patrick","Aaron","Benjamin",
            "Paul","Gregory","Nathan","Shawn","Jesse","Sean","Chad","Ava","Emily","Emma","Madison","Olivia","Isabella","Abigail",
            "Hannah","Sarah","Alexis","Sophia","Grace","Elizabeth","Samantha","Kayla","Julia","Ella","Alyssa","Lauren","Anna","Mia",
            "Chloe","Natalie","Morgan","Gianna","Taylor","Brianna","Brooke","Hailey","Ashley","Riley","Lily","Savannah","Mackenzie",
            "Sydney","Paige","Victoria","Nevaeh","Jessica","Leah","Rachel","Addison","Megan","Gabriella","Angelina","Kylie","Alexandra",
            "Kaitlyn","Lillian","Kaylee","Gabrielle","Allison","Makayla","Katherine","Katelyn","Jenna"};

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

        Patient p = new Patient("Sally", stroke);
        for(int i = 0; i< 9; i++)
        {
            Random r = new Random();
            int first = r.nextInt(3);
            int second = r.nextInt(98);
            Patient test = new Patient(names[second], disList.get(first));
            patList.add(test);
        }

        System.out.println(patList);
    }

}
