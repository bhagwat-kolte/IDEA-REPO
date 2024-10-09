package org.amol.udemy.basic.esm;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 * Speed converter Java program
 */
public class SpeedConverter {

    public static Long toMilesPerHour(Double kilometersPerHour){
        long result = 0;

        if(kilometersPerHour < 0)
            result =  -1;
        else {
            result = Math.round(Math.round(kilometersPerHour) * 0.62137);
        }

        return result;
    }

    public static void printConversion(Double kilometersPerHour){
        Long result = toMilesPerHour(kilometersPerHour);
        if( result == -1)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour +" km/h = " + result + " mi/h");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        Double number = scanner.nextDouble();

        printConversion(number);
    }
}
