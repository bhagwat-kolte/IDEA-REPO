package org.mack.hckrerth.basic.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bhagwat Kolte
 * You have been given a String S consisting of uppercase and lowercase English alphabets.
 * You need to change the case of each alphabet in this String.
 * That is, all the uppercase letters should be converted to lowercase and all the lowercase letters
 * should be converted to uppercase. You need to then print the resultant String to output.
 */
public class ToggleString {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toString();
        StringBuilder outPut = new StringBuilder();

        for (int i = 0; i< input.length(); i++){
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch)){
                outPut.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                outPut.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(outPut.toString());
    }
}
