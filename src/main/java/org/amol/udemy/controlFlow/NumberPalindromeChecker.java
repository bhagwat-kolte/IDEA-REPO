package org.amol.udemy.controlFlow;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * Java program to check number is Palindrome or not
 */

interface NumberChecker {
    boolean isNumberPalindrome(Long num);
}
public class NumberPalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        Long number = scanner.nextLong();

        NumberChecker numChk = (n) ->{
            String num = "" + n;
            StringBuilder num1 = new StringBuilder();
            if(num.substring(0,1).equals("-")){
                num1.append(num.substring(1));
                num = num.substring(1);
            }else{
                num1.append(num);
            }

            String temp = num1.reverse().toString();

            if(num.equalsIgnoreCase(temp))
                return true;
            else
                return false;
        };

        if(numChk.isNumberPalindrome(number))
            System.out.println("Given number " + number + " is Palindrome Number");
        else
            System.out.println("Given number " + number + " is not Palindrome Number");
    }
}
