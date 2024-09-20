package org.amol.basic.esm;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 * <p>
 * Java program to check number Positive, Negative or Zero
 */
public class PositiveNegativeZero {

    public static void checkNumber(Double number) {

        if (number > 0)
            System.out.println("Given number is positive");
        else if (number < 0)
            System.out.println("Given number is negative");
        else
            System.out.println("Given number is zero");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        Double number = scanner.nextDouble();
        checkNumber(number);

    }
}
