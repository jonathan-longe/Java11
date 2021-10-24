package Chap13;

import java.util.Scanner;
class Chap13Ex3
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int numberOfItems;
        long heatingTime;

        System.out.println("Enter the heating time for one item in seconds");
        heatingTime = scan.nextLong();

        System.out.println("Enter the number of items you want to heat up (No more than 3)");
        numberOfItems = scan.nextInt();

        if (numberOfItems == 1)
            System.out.println("It will take " + heatingTime + " seconds to heat up.");
        else if (numberOfItems == 2)
            System.out.println("It will take " + heatingTime * 1.50 + " seconds to heat up.");
        else
            System.out.println("It will take " + heatingTime * 2 + " seconds to heat up.");
    }
}
