package org.amol.hckrerth.basic.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bhagwat Kolte
 * You are required to enter a word that consists of x and y that denote the number of Zs and Os respectively.
 * The input word is considered similar to word zoo if 2 * x = y.
 * Determine if the entered word is similar to word zoo.
 * For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.
 */
public class ZoosFinder {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toString();
        if (input.length() <= 20){
            int count = 0;
            int cnt = 0;
            for (int l = 0; l < input.length(); l++){
                if(input.charAt(l) == 'z' || input.charAt(l) == 'Z'){
                    count ++;
                }
                if(input.charAt(l) == 'o' || input.charAt(l) == 'O'){
                    cnt ++;
                }
            }
            if ((count * 2) == cnt){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }
    }
}
