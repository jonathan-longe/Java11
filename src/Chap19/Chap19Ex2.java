package Chap19;

import java.util.Scanner;
class Chap19Ex2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double drugEffectiveness;
        double expirationRate;
        double expirationThreshold;
        int month = 0;

        System.out.print("Enter drug effectiveness:");
        drugEffectiveness = scan.nextDouble();

        System.out.print("Enter expiration rate:");
        expirationRate = scan.nextDouble();

        System.out.print("Enter expiration threshold:");
        expirationThreshold = scan.nextDouble();

        double finalExpirationRate = expirationRate / 100;

        while (drugEffectiveness < expirationThreshold) {
            System.out.print("Month: " + month);
            System.out.println("     Effectiveness: " + drugEffectiveness);

            drugEffectiveness = drugEffectiveness - finalExpirationRate;

            month++;
        }

        System.out.println("DISCARD after " + month + " months");

    }
}

