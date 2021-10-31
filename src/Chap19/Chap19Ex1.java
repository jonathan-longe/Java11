package Chap19;

import java.util.Scanner;
class Chap19Ex1
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double debt;
        double interestRateInit;
        int monthlyPayment;
        int month = 1;

        System.out.print("Enter monthly payment:");
        monthlyPayment = scan.nextInt();

        System.out.print("Enter debt amount:");
        debt = scan.nextDouble();

        System.out.print("Enter interest rate as a percent:");
        interestRateInit = scan.nextDouble();

        double finalInterestRate = interestRateInit / 100 + 1;

        while (debt > 0) {
            debt = debt * finalInterestRate - monthlyPayment;

            if (debt < 0)
                debt = 0;

            System.out.print("Month: " + month);
            System.out.print("     Debt: " + debt);
            System.out.println("     total monthly payment: " + monthlyPayment);

            month++;
        }

        System.out.println("Debt payed in " + (month - 1) + " months");
    }
}

