package org.amol.basic.controlFlow;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * java program to check the input number in switch
 */
public class CheckNumberUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        switch (number){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> System.out.println("Value was 3, or 4, or 5");
            default -> System.out.println("Value was not from 1 to 5");
        }
    }
}
