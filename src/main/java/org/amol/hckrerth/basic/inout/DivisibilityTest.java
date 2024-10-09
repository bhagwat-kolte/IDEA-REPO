package org.amol.hckrerth.basic.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Bhagwat Kolte
 *
 * You are provided an array A of size n that contains non-negative integers.
 * Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers
 * is divisible by 10.
 */
public class DivisibilityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nosOfTests = Integer.parseInt(br.readLine().toString());
        String[] secondline = new String[nosOfTests];
        secondline = br.readLine().split(" ");
        br.close();

        int[] arrayA = new int[nosOfTests];
        for (int i = 0; i < nosOfTests; i++) {
            arrayA[i] = Integer.parseInt(secondline[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arrayA.length; i++){
            sb.append(arrayA[i] % 10);
        }
        try{
            BigInteger a = new BigInteger(sb.toString());
            BigInteger b = new BigInteger("" +10);
            BigInteger tst = a.mod(b);
            if (0 == tst.intValue())
                System.out.println("Yes");
            else
                System.out.println("No");
        }catch (NumberFormatException e){
            System.out.println("No");
        }

    }
}
