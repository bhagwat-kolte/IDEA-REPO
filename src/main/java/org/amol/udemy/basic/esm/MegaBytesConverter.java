package org.amol.udemy.basic.esm;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 * Java Program to megabyte converter
 */
public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int mbyte = 0;
        int rem = 0;

        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else if (kiloBytes == 0)
            System.out.println("0 KB = 0 MB and 0 KB");
        else{
            mbyte = kiloBytes / 1024;
            rem = kiloBytes % 1024;
            System.out.println(kiloBytes +" KB = " + mbyte + " MB and "+ rem + " KB");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        printMegaBytesAndKiloBytes(number);
    }
}
