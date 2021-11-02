package Chap16;

import java.util.Scanner;
class Chap16Ex1
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int countTotal = 0;
        int sumTotal = 0;

        System.out.println("Enter how many integers will be added:");
        countTotal = scan.nextInt();

        while (countTotal > 0) {
            System.out.println("Enter an integer:");
            sumTotal = sumTotal + scan.nextInt();;
            countTotal --;
        }

        System.out.println("The sum is: " + sumTotal); // final answer


    }
}
