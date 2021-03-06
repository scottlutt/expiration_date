package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Simulation extends Main{

    private int totalTurns = 30;
    private int deathLimit = 5;
    private int deathCount = 0;

    public void decTotalTurns()
    {
        totalTurns--;
    }

    public void incDeathCount()
    {
        deathCount++;
    }

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


        Facilities hospital = new Facilities("Mount Nittany Hospital", 6, "Hospital");
        Facilities urgentCare = new Facilities("Med Express", 6, "Urgent Care");
        Facilities trauma = new Facilities("Trauma center", 6, "Trauma");

        facList.add(hospital);
        facList.add(urgentCare);
        facList.add(trauma);

        Disease stroke = new Disease("stroke", 7, hospital);
        Disease heartAttack = new Disease("Heart Attack", 5, trauma);
        Disease flu = new Disease("Flu", 1, urgentCare);
        Disease lungCancer = new Disease("Lung Cancer", 25, hospital);
        Disease brainTumorumor = new Disease("Brain Tumor", 15, hospital);


        disList.add(stroke);
        disList.add(heartAttack);
        disList.add(flu);
        disList.add(lungCancer);
        disList.add(brainTumorumor);

        //System.out.println(hospital);
        //System.out.println(stroke+ " "+stroke.getCorrectLocation(hospital)); //KEEP THIS LINE

        //creates patient objects and stores them in an ArrayList. Currently 50 patients
        for(int i = 0; i < 51; i++)
        {
            Random r = new Random();
            int first = r.nextInt(5);
            int second = r.nextInt(98);
            Patient test = new Patient(names[second], disList.get(first));
            patList.add(test);
        }

        System.out.println(patList);

        //Logic for the controller that connects view and model
        /*int patListCount = 0;
        do
        {
            if(button click the value of [Disease].getCurrentLocation([Facility]))
            {
                //add patient to respective facility list
                //delete patient from patList

                //decrease patientTurnCount
                //decrease numBeds in facility
                //update GUI boxes displaying patients, facilities numBeds attribute, show remaining patientTurns
            }
            else {
                //delete patient from patList;
                deathCount ++;
                //notify user that patient has expired
                //update GUI deathCount number
            }
            totalTurns --;
            //update GUI totalTurnCount display

        }while(totalTurns > 0 || deathCount <= deathLimit);*/


        //Tests decNumTurns
        /*Patient p = new Patient("Charlie", stroke); //Tests to make sure decNumTurns works
        System.out.println(p);
        p.decNumTurns();
        System.out.println(p);
        System.out.println(p.getDisease().getFacilityName());
        //System.out.println(stroke + " " + stroke.getCorrectLocation(hospital));*/
    }
}
