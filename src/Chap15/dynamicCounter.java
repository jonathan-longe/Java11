package Chap15;

import java.util.Scanner;
class dynamicCounter
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int startValue;
        int endValue;

        System.out.println("Enter starting value:");
        startValue = scan.nextInt();

        System.out.println("Enter ending value:");
        endValue = scan.nextInt();

        while (startValue <= endValue) {
            System.out.println(startValue);
            startValue++;
        }
    }
}
