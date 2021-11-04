package Chap14;

import java.util.Scanner;
class tirePressureRange2
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

        if (frontLeftPressure == frontRightPressure && backLeftPressure == backRightPressure) {
            if (frontLeftPressure > 35 && frontLeftPressure < 45)
                System.out.println("Inflation is in range on the front left tire");
            else
                System.out.println("Inflation is bad on the front left tire");

            if (frontRightPressure > 35 && frontRightPressure < 45)
                System.out.println("Inflation is in range on the front right tire");
            else
                System.out.println("Inflation is bad on the front right tire");

            if (backLeftPressure > 35 && backLeftPressure < 45)
                System.out.println("Inflation is in range on the back left tire");
            else
                System.out.println("Inflation is bad on the back left tire");

            if (backRightPressure > 35 && backRightPressure < 45)
                System.out.println("Inflation is in range on the back right tire");
            else
                System.out.println("Inflation is bad on the back right tire");
        }
        else
            System.out.println("Inflation is not even across all tires");
    }
}
