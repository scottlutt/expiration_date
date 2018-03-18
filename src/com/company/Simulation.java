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

        //creates patient objects and stores them in an ArrayList
        /*for(int i = 0; i< 10; i++)
        {
            Random r = new Random();
            int first = r.nextInt(5);
            int second = r.nextInt(98);
            Patient test = new Patient(names[second], disList.get(first));
            patList.add(test);
        }

<<<<<<< HEAD
        System.out.println(patList);*/

        //int patientListIndex = 0;
        //do {
            //game code in here
            /*Traverse through patient list and display in GUI
              if the value of the button they click is equal to [Disease].getCorrectLocation([Facilities]))
              -move that patient out of patient list and into facility specific list
              -update and display patient in GUI
              -decrease patient turn count
              -decrease facilily numBed count associated with the patient
              -update display in GUI
              else
              -delete patient from patient list (they die)
              -increase death count
              -update display count in GUI

              decrease total turn count*/
        //} while(totalTurns > 0 || deathCount < deathLimit);
=======
        System.out.println(patList);
        

        int patListCount = 0;
        do
        {
            if(/*button click the value of [Disease].getCurrentLocation([Facility])*/)
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

        }while(totalTurns > 0 || deathCount <= deathLimit);

>>>>>>> 7c5050ecbd7132a4736a9ef886f0431effaf980f

        /*for(int i =0; i<patList.size();i++) //Not sure what this does anymore
        {
            patList.get(i).decNumTurns(patList.get(i).getNumTurns());// make a copy of turn count then decrease using method
        }
        System.out.println(patList);
        //System.out.println(patList.get(0).getNumTurns()-1);
        System.out.println(disList);*/

        Patient p = new Patient("Charlie", stroke); //Tests to make sure decNumTurns works
        System.out.println(p);
        p.decNumTurns();
        System.out.println(p);
        System.out.println(p.getDisease().getFacilityName());
        //System.out.println(stroke + " " + stroke.getCorrectLocation(hospital));
    }

    /* First and last numbers should be the same with a zero in between
       this means that at the for loop is actually decreasing the turn value associated with the patient.
       We may have to store the turn count within the patient object (copy) and decrement that instead of
       making a temporary copy in scope*/

}
