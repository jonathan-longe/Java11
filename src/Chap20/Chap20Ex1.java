package Chap20;

import java.util.Scanner;
class Chap20Ex1
{

        public static void main( String[] args )
        {
            int lockFirst = 10, lockSecond = 20, lockThird = 30;
            int numb;

            Scanner scan = new Scanner (System.in);

            int     attempt     = 0;
            boolean open    = false;

            while ( attempt < 3 && !open )
            {
                // try a combination, setting open to "true" if correct

                boolean firstLockOpen =  false;
                boolean secondLockOpen =  false;
                boolean thirdLockOpen =  false;

                //First Number
                System.out.println("\nEnter first number: ");
                numb  = scan.nextInt();

                if (numb <= lockFirst + 3 && numb >= lockFirst - 3)
                    firstLockOpen = true ;

                //Second Number
                System.out.println("Enter second number: ");
                numb  = scan.nextInt();

                if (numb <= lockSecond + 3 && numb >= lockSecond - 3)
                    secondLockOpen = true  ;

                //Third Number
                System.out.println("Enter third number: ");
                numb  = scan.nextInt();

                if (numb <= lockThird + 3 && numb >= lockThird - 3)
                    thirdLockOpen = true  ;

                //Result
                if ( firstLockOpen && secondLockOpen && thirdLockOpen)
                {
                    System.out.println("Lock opens");
                    open = true;
                }
                else
                    System.out.println("Lock does not open");

                attempt = attempt + 1;
            }

        }
    }

