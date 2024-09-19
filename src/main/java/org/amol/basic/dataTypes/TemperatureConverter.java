package org.amol.basic.dataTypes;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * Java program to convert temperature from Fahrenheit to Celsius degrees
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");

        Double temp = scanner.nextDouble();

        Double tempInCelsius = (temp - 32) * 5/9;

        System.out.println(temp + " degree Fahrenheit is equal to " + tempInCelsius + " in Celsius");
        System.out.println(temp + " degree Fahrenheit is equal to " + Math.round(tempInCelsius) + " in Celsius");
    }
}
