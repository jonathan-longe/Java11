package Chap23;

//this program reads data from a file instead of a keyboard

import java.io.*;
import java.util.Scanner;

class Java12Question2

{

    public static void main (String[] args) throws IOException

    {

        File file = new File("peopleDatabaseTest.txt");

        Scanner scan = new Scanner( file );

        int age, iq, gender, height;
        int personCount = 0;
        int maleCount = 0, femaleCount = 0;
        int tallGeniusMales = 0;
        int averageIQ = 0, totalIQ = 0;
        int averageHeight = 0, totalHeight = 0;
        int oldestPerson = 0, youngestPerson = 9999999;

        while (scan.hasNextInt()) // loops while there is another data point

        {

            age = scan.nextInt(); //gets a temporary age var
            System.out.println(age);

            iq = scan.nextInt();  //gets a temporary iq var
            System.out.println(iq);

            gender = scan.nextInt();  //gets a temporary gender var
            System.out.println(gender);

            height = scan.nextInt();  //gets a temporary height var
            System.out.println(height);

            totalIQ = totalIQ + iq; // adds current person's IQ to the total
            totalHeight = totalHeight + height; // adds current person's height to the total


            if (gender == 1) { // counts number of males vs females
                maleCount++;
            }
            else {
                femaleCount++;
            }


            if (gender == 1 && height >= 72 && iq >= 120) { // counts the very small number of tall male geniuses
                tallGeniusMales++;
            }


            if (age > oldestPerson) { //only changes oldestPerson if oldestPerson is smaller than age
                oldestPerson = age;
            }

            if (age < youngestPerson) { // only changes youngestPerson if youngestPerson is bigger than age
                youngestPerson = age;
            }

            personCount++; // everytime this loops (or there's another person) it adds one


        }

        averageIQ = totalIQ / personCount;
        averageHeight = totalHeight / personCount;


        // after all the people are gone the program shows the statistics

        System.out.println("There were " + personCount + " people surveyed");
        System.out.println("There were " + maleCount + " males");
        System.out.println("And " + femaleCount + " females");
        System.out.println("There were " + tallGeniusMales + " Males over 6 feet tall and geniuses");
        System.out.println("The average IQ was " + averageIQ);
        System.out.println("And the average height was " + averageHeight + " inches");
        System.out.println("The oldest person was " + oldestPerson + " years old");
        System.out.println("And the youngest person was " + youngestPerson + " years old");

        scan.close();

    }

}