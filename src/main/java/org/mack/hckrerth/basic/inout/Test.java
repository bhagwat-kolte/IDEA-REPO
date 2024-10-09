package org.mack.hckrerth.basic.inout;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 */
public class Test {
    public static void main(String args[]) throws Exception {
        // Write your code here

        Scanner scan = new Scanner(System.in);
        String tag = scan.nextLine();

        boolean isVowel = tag.charAt(2) == 'A' || tag.charAt(2) == 'E' || tag.charAt(2) == 'I'

                || tag.charAt(2) == 'O' || tag.charAt(2) == 'U' || tag.charAt(2) == 'Y';

        boolean isSumEven = true;



        if(isVowel) {

            System.out.println("invalid");

        }

        else {

            // indices 2 & 6 are non digits (X & -)

            int[] nonDigitsI = {2, 6};



            for(int i = 0; i < nonDigitsI[0] - 1; i++) {

                int sum = Integer.parseInt(tag.charAt(i) + "") + Integer.parseInt(tag.charAt(i + 1) + "");

                if(sum % 2 != 0)

                    isSumEven = false;

            }

            for(int i = nonDigitsI[0] + 1; isSumEven && i < nonDigitsI[1] - 1; i++) {

                int sum = Integer.parseInt(tag.charAt(i) + "") + Integer.parseInt(tag.charAt(i + 1) + "");

                if(sum % 2 != 0)

                    isSumEven = false;

            }

            for(int i = nonDigitsI[1] + 1; isSumEven && i < tag.length() - 1; i++) {

                int sum = Integer.parseInt(tag.charAt(i) + "") + Integer.parseInt(tag.charAt(i + 1) + "");

                if(sum % 2 != 0)

                    isSumEven = false;

            }
            System.out.println(isSumEven ? "valid" : "invalid");

        }
    }
}
