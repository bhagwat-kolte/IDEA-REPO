package org.amol.udemy.controlFlow;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 */
public class QuarterCheckUsingSwitch {

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad";
        };
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month");
        String month = scanner.next();

        System.out.println(getQuarter(month));

    }
}
