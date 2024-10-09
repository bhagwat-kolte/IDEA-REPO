package org.amol.udemy.controlFlow;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 */
interface SumOfEvenNumbers {
    Long getSumOfEvenNumbers(long num);
}

public class SumOfEvenNumberFromInput {
    public static void main(String[] args) {
        SumOfEvenNumbers sumOfEvenNumbers = (n) -> {
            long sum = 0;

            if (n <= 1) {
                return (long) -1;
            }
            int len = (int) (Math.log10(n) + 1);
            if (len == 1) {
                if (n % 2 == 0) {
                    return n;
                }
            } else {
                for (int i = 0; i < len; i++) {
                    long temp = n % 10;
                    n = n / 10;

                    if (temp % 2 == 0) {
                        sum += temp;
                    }
                }

            }
            return sum;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        long number = scanner.nextLong();

        number = sumOfEvenNumbers.getSumOfEvenNumbers(number);
        if (number == -1)
            System.out.println("Given number is invalid Number");
        else
            System.out.println("Sum of even numbers from given number is " + number);
    }
}
