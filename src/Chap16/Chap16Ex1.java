import java.util.Scanner;
class Chap16Ex1
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int intToAdd;
        int count = 0;
        int number = 0;
        int numberAdded;

        System.out.println("Enter how many integers will be added:");
        intToAdd = scan.nextInt();

        while (count != intToAdd) {
            System.out.println("Enter an integer:");
            numberAdded = scan.nextInt();
            number = number + numberAdded;
            count ++;

        }

        System.out.println("The sum is: " + number); // final answer


    }
}
