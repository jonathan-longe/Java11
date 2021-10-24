package Chap13;

import java.util.Scanner;
class Chap13Ex1
{
    public static void main (String[] args)
    {
    Scanner scan = new Scanner(System.in);

    String item;
    double price;
    String fastDelivery;
    double shippingCost;

    System.out.println("Enter the Item:");
    item = scan.nextLine();

    System.out.println("Enter the price:");
    price = scan.nextDouble();

    System.out.println("Overnight shipping? (yes or no)");
    fastDelivery = scan.nextLine();
    fastDelivery = scan.nextLine();

    if (price < 10) // shipping under 10 is less right?
        shippingCost = 2.00;
    else
        shippingCost = 3.00;

    if (fastDelivery.equals("yes"))
        shippingCost = shippingCost + 5.00;

    System.out.println("Invoice:");
    System.out.println(item + "  " + price + "$");
    System.out.println("Shipping: " + shippingCost + "$");
    System.out.println("Total: " + (price + shippingCost) + "$");

    }
}
