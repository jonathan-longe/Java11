package Chap23;

import java.util.Scanner;
import java.io.*;

class Java12Question1

{

    public static void main ( String[] args ) throws IOException

    {

        Scanner scan = new Scanner(System.in);

        int age = 0;
        int iq;
        int gender;
        int height;

        File file = new File( "peopleDatabaseTest.txt" );

        PrintStream print = new PrintStream( file );

        while (age !=-1)

        {

            System.out.print("Enter your age (-1 to exit): ");
            age = scan.nextInt();

            if (age != -1) {

                print.println(age);


                System.out.print("Enter your IQ: ");
                iq = scan.nextInt();

                print.println(iq);


                System.out.print("Enter your gender 1 for male 0 for female: ");
                gender = scan.nextInt();

                print.println(gender);


                System.out.print("Enter your height in inches: ");
                height = scan.nextInt();

                print.println(height);
            }

            else {
                System.out.println("Done");
                scan.close();
            }

        }

    }

}