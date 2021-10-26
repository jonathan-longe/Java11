package Chap16;

import java.util.Scanner;
class Chap16Ex2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        int count = 1;
        double sum = 0;

        System.out.println("Enter N:");
        n = scan.nextInt();

        while (count <= n) {
            sum = sum + 1.0/count;
            count++;
        }

        System.out.println(sum);

    }
}