import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int TOTAL_NUMBERS = 5;
        int[] numbers = new int[TOTAL_NUMBERS];
        int i;


        System.out.println("Please enter " + TOTAL_NUMBERS + " numbers to determine the product : ");
        // prompt user for 5 numbers to store in ArrayList
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = scnr.nextInt();
        }
        // numbers Array has 5 numbers
        int Calculation = calculateProduct(numbers, 4);
        System.out.println("The product of the five numbers is : " + Calculation);
        //uses recursive method listed below
    }
    public static int calculateProduct(int[] numbers, int index) {
        if ( index < 0 ) {   //base case
            return 1;
        }
        return numbers[index] * calculateProduct(numbers, --index);
        // recursive case

    }
    }






