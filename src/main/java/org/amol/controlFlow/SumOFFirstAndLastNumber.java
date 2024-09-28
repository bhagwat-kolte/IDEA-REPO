package org.amol.controlFlow;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * Java program to calculate the sum of first and last digit.
 */
interface SumOfDigits{
    int getSumOfDigits(int num);
}
public class SumOFFirstAndLastNumber {
    public static void main(String[] args) {

        SumOfDigits sumOfDigits = (n) ->{
            if(n == 0){
                return 0;
            } else if (n < 0) {
                return -1;
            }
            String numString = "" + n;
            if(numString.length() == 1){
                return n + n;
            } else if (numString.length() > 1) {

                return Integer.parseInt("" + numString.charAt(0))
                        + Integer.parseInt("" + numString.charAt(numString.length() - 1));
            }
            return -1;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        number = sumOfDigits.getSumOfDigits(number);
        if( number == -1)
            System.out.println("Given number is invalid Number");
        else
            System.out.println("Sum of first and last digits of given number is " + number);

    }
}
