package Chap18;

import java.util.Scanner;
class inRangeTest
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int inRangeSum = 0; // for ints in range
        int outOfRangeSum = 0;  // for ints out of range

        int highEndRange; // stores the highest and lowest ranges
        int lowEndRange;

        int data = 1; // temp stores most recent data added

        System.out.println("Enter high end of range:");
        highEndRange = scan.nextInt();

        System.out.println("Enter low end of range:");
        lowEndRange = scan.nextInt();

        while (data != 0) {
            System.out.println("Enter data:");
            data = scan.nextInt();
            if (data >= lowEndRange && data <= highEndRange) {
                inRangeSum = inRangeSum + data;
            }
            else {
                outOfRangeSum = outOfRangeSum + data;
            }
        }

        System.out.println("Sum of in range values: " + inRangeSum);
        System.out.println("Sum of out of range values: " + outOfRangeSum);
    }
}
