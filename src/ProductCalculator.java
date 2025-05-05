import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int TOTAL_NUMBERS = 5;
        int[] numbers = new int[TOTAL_NUMBERS];
        int i;


        System.out.println("Please enter " + TOTAL_NUMBERS + " numbers to determine the product : ");
        // prompt user for 5 numbers to store in ArrayList

        /*for loop that scans for input with try catch block that insists on valid integer input*/
        for (i = 0; i < numbers.length; i++) {

            boolean validInput = false;
            while (!validInput) {
                try {
                    numbers[i] = scnr.nextInt();
                    validInput = true;
                }catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid, please enter a number.");
                    scnr.next();
                }
            }
        }


        // numbers Array has 5 numbers
        int Calculation = calculateProduct(numbers, 4);
        System.out.println("The product of the five numbers is : " + Calculation);
        //uses recursive method listed below

        scnr.close();
    }


    public static int calculateProduct(int[] numbers, int index) {
        if ( index < 0 ) {   //base case
            return 1;
        }
        return numbers[index] * calculateProduct(numbers, --index);
        // recursive case

    }
    }






