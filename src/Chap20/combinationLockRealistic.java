package Chap20;

import java.util.Scanner;
class combinationLockRealistic
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        int attempts = 0;
        double theNumber = Math.round(10 * Math.random());
        int guess;
        boolean correct = false;

        System.out.println("I am thinking of a number between 1 and 10, you must guess what it is in three tries");

        while (attempts < 3 && !correct){
            System.out.println("Enter a guess:");
            guess = scan.nextInt();

            if (theNumber == guess) {
                attempts = 3;
                correct = true;
                System.out.print("RIGHT! ");
                System.out.println("You have won the game!");
            }
            else {
                System.out.println("wrong");
                attempts++;
            }

            if (attempts >= 3 && !correct) {
                System.out.print("The correct number is " + theNumber);
                System.out.println(" you have lost the game");
            }
        }
    }
}

