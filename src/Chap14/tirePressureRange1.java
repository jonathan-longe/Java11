package Chap14;

import java.util.Scanner;
class tirePressureRange1
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int frontRightPressure;
        int frontLeftPressure;
        int backRightPressure;
        int backLeftPressure;

        System.out.println("Input the front right tire's pressure in PSI:");
        frontRightPressure = scan.nextInt();

        System.out.println("Input the front left tire's pressure in PSI:");
        frontLeftPressure = scan.nextInt();

        System.out.println("Input the back right tire's pressure in PSI:");
        backRightPressure = scan.nextInt();

        System.out.println("Input the back left tire's pressure in PSI:");
        backLeftPressure = scan.nextInt();

        if (frontLeftPressure == frontRightPressure && backLeftPressure == backRightPressure)
            System.out.println("Inflation is GOOD!");
        else
            System.out.println("Inflation is BAD!");
    }
}
