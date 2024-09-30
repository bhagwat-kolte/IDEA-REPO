package mack.hckrerth.basic.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * You have been given an array A of size N consisting of positive integers.
 * You need to find and print the product of all the number in this array Modulo 10^9 +7.
 *
 * Input Format:
 * The first line contains a single integer N denoting the size of the array.
 * The next line contains N space separated integers denoting the elements of the array
 *
 * Output Format:
 * Print a single integer denoting the product of all the elements of the array Modulo 10^9 +7.
 */

public class FindProduct {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        long ans = 1;
        long exp = (long) (Math.pow(10, 9));
        for (int i = 0; i < n; i++) {
            ans = (ans * arr[i]) % (exp + 7);
        }
        System.out.println(ans);
    }
}
