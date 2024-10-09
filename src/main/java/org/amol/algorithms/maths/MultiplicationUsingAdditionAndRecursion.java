package org.amol.algorithms.maths;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * java program to implement (n + 1)a = na +a
 */
public class MultiplicationUsingAdditionAndRecursion {

    public static long multiply(long num1, long num2){
        if (num1 == 1)
            return  num2;
        else
            return multiply(num1 - 1, num2) + num2;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        long value = scanner.nextLong();

        System.out.println("Enter a multiply by value");
        long num = scanner.nextLong();

        System.out.println("Multiplication of " + value + "and " + num + " is " + multiply(num, value));
    }
}
