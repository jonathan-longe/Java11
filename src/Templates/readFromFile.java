package Templates;

//this program reads data from a file instead of a keyboard

import java.util.Scanner;

import java.io.*;

class readFromFile

{

    public static void main (String[] args) throws IOException

    {

        File file = new File("data1.txt");

        Scanner scan = new Scanner( file );

        int data=0;

        while (data != -1)

        {

            data=scan.nextInt();

            System.out.println(data);

        }

        scan.close();

    }

}