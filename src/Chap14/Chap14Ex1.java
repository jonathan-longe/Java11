package Chap14;

import java.util.Scanner;
class Chap14Ex1
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double balance;

        System.out.println("Enter your bank balance:");
        balance = scan.nextDouble();

        if (balance >= 1500)
            System.out.println("There is not check writing fee for you account!");
        else
            System.out.println("you need to pay 15 cents for every check you write");
    }
}