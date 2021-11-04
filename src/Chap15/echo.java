package Chap15;

import java.util.Scanner;
class echo
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String word;

        System.out.println("Enter a word of your choice:");
        word = scan.nextLine();

        int i = 1;

        while (i <= word.length()) {
            System.out.println(word);
            i++;
        }
    }
}

