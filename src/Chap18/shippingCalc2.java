package Chap18;

import java.util.Scanner;
class shippingCalc2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int weight = 1;
        double handlingFee = 3.00;
        double shippingFee = 0;

        while (weight != 0) {
            System.out.println("Weight of order in pounds:");
            weight = scan.nextInt();

            if (weight > 10) {
                shippingFee = (weight - 10) * 0.25;
            }

            double finalCost = handlingFee + shippingFee;

            System.out.println("Shipping cost: $" + finalCost);
        }

        System.out.println("Bye!");


    }
}