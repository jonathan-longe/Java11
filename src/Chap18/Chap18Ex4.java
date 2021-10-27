package Chap18;

import java.util.Scanner;
class Chap18Ex4
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int firstCornerX, firstCornerY, secondCornerX, secondCornerY;
        int width = 1, height = 1, area = 1;

        System.out.println("Computer Aided Design Program");

        while (height != 0 || width != 0) {

            System.out.println("First corner X coordinate:");
            firstCornerX = scan.nextInt();

            System.out.println("First corner Y coordinate:");
            firstCornerY = scan.nextInt();

            System.out.println("Second corner X coordinate:");
            secondCornerX = scan.nextInt();

            System.out.println("Second corner Y coordinate:");
            secondCornerY = scan.nextInt();

            width = secondCornerX - firstCornerX;
            height = secondCornerY - firstCornerY;
            area = height * width;

            if (width < 0)
                width = width * -1;

            if (height < 0)
                height = height * -1;

            if (area < 0)
                area = area * -1;

            System.out.print("Width: " + width);
            System.out.print("     Height: " + height);
            System.out.println("     Area: " + area);
        }

        System.out.println("Bye!");

    }
}
