package Chap19;

import java.util.Scanner;
class Chap19Ex2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double drugEffectiveness = 100;
        double expirationRate = 4;
        double expirationThreshold = 50;
        double finalExpirationRate;
        int month = 0;

        System.out.print("Enter drug effectiveness:");
        drugEffectiveness = scan.nextDouble();

        System.out.print("Enter expiration rate:");
        expirationRate = scan.nextDouble();

        System.out.print("Enter expiration threshold:");
        expirationThreshold = scan.nextDouble();



        while (drugEffectiveness > expirationThreshold) {
            System.out.print("Month: " + month);
            System.out.println("     Effectiveness: " + drugEffectiveness);

            finalExpirationRate = drugEffectiveness * (expirationRate / 100);

            drugEffectiveness = drugEffectiveness - finalExpirationRate;

            month++;
        }

        System.out.print("Month: " + month);
        System.out.print("     Effectiveness: " + drugEffectiveness);
        System.out.println("     DISCARD");

    }
}

