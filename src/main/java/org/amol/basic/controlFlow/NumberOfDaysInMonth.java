package org.amol.basic.controlFlow;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 */
public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        boolean IS_LEAP_YEAR = false;
        if ( year % 4 == 0){
            IS_LEAP_YEAR = true;
            if (year % 100 == 0){
                if (year % 400 == 0){
                    IS_LEAP_YEAR = true;
                }else
                    IS_LEAP_YEAR = false;
            }
        }else
            IS_LEAP_YEAR = false;

        return IS_LEAP_YEAR;
    }

    public static int getDaysOfMonths(int year, int month){
        int result = 0;
        if (year <= 0 || year > 9999)
            return -1;
        if (month <= 0 || month > 12)
            return 0;

        boolean leapYear = isLeapYear(year);
        if(leapYear){
            String dayOfMonth = switch (month) {
                case 1 -> { yield "31"; }
                case 2 -> "29";
                case 3, 5, 7, 8, 10, 12 -> "31";
                case 4, 6, 9, 11 -> "30";
                default -> "-2";
            };
            result = Integer.parseInt(dayOfMonth);
        } else {
            String dayOfMonth = switch (month) {
                case 1 -> { yield "31"; }
                case 2 -> "28";
                case 3, 5, 7, 8, 10, 12 -> "31";
                case 4, 6, 9, 11 -> "30";
                default -> "-2";
            };
            result = Integer.parseInt(dayOfMonth);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month");
        int month = scanner.nextInt();
        System.out.println("Enter a Year");
        int year = scanner.nextInt();

        System.out.println(getDaysOfMonths(year, month));
    }
}
