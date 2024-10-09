package org.amol.hckrerth.basic.inout;



import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * You have been given a positive integer N. You need to find and print the Factorial of this number
 */
interface FactorialGenerator {
    long getFactorial(Long num);
}
public class FactorialFinder {

    public static void main(String[] args) {
        FactorialGenerator factorialGenerator = (n) ->{
            long fact = 1;
            for (int i = 1; i < n; i++)
                fact = fact * i;

            return fact;

        };

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        System.out.println(factorialGenerator.getFactorial(Long.parseLong(name)));
    }


}
