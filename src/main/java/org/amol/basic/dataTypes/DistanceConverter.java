package org.amol.basic.dataTypes;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * Java program that reads a number in inches and converts it to meters.
 */
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in inches");

        Double inches = scanner.nextDouble();

        Double meter = inches * 0.0254;

        System.out.println(inches + " inches is equal to " + meter + " in meter");
        System.out.println(inches + " inches is equal to " + Math.round(meter) + " in meter");
    }
}
