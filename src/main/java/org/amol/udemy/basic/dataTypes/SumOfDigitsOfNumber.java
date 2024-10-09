package org.amol.udemy.basic.dataTypes;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * Java program that reads an integer between 0 and 1000 and adds all the digits in the integer
 */
public class SumOfDigitsOfNumber {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer num = scanner.nextInt();

        for(int i = 0; i < 4; i++){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits is " + sum);
    }
}
