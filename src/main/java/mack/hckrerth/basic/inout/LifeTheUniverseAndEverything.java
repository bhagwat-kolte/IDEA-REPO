package mack.hckrerth.basic.inout;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 * our program is to use the brute-force approach in order to find the Answer to Life,
 * the Universe, and Everything. More precisely... rewrite small numbers from input to output.
 * Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.
 */
public class LifeTheUniverseAndEverything {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            int num = Integer.parseInt(s.nextLine());
            if(num != 42)
                System.out.println(num);
            else if (num == 42) {
                break;
            }
        }
    }
}
