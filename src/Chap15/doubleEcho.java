package Chap15;

import java.util.Scanner;
class doubleEcho
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String firstWord;
        String secondWord;

        System.out.println("Enter a word of your choice:");
        firstWord = scan.nextLine();

        System.out.println("Enter another word of your choice:");
        secondWord = scan.nextLine();

        System.out.print(firstWord);

        int i = 1;

        while (i <= 30) {
            System.out.print(".");
            i++;
        }

        System.out.print(secondWord);
    }
}

