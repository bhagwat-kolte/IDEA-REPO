package org.mack.hckrerth.basic.inout;

import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * You have been given 3 integers - l, r and k.
 * Find how many numbers between l and r (both inclusive) are divisible by k.
 * You do not need to print these numbers, you just have to find their count.
 */
public class CountDivisors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nums = s.nextLine();
        String [] nums1 = nums.split(" ");
        int num1 = Integer.parseInt(nums1[0]);
        int num2 = Integer.parseInt(nums1[1]);
        int num3 = Integer.parseInt(nums1[2]);
        int count = 0;

        if ((1 <= num1 && num1 < num2 && num2 <= 1000)
                && (1 <= num3 && num3 <= 1000)){
            for (int i = num1; i <= num2; i++){
                if (i % num3 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
