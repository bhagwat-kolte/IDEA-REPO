package mack.hckrerth.basicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bhagwat Kolte
 *You are given two arrays a1,a2,a3.....an and b1,b2,b3.....bn. In each step, you can set ai = ai- bi if ai >= bi.
 * Determine the minimum number of steps that are required to make all a's equal.
 */
public class NumberOfSteps {

    public static boolean isPositiveElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSameElement(int[] array) {
        boolean same = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                same = false;
            }
        }
        return same;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int elements = Integer.parseInt(br.readLine().toString());
        int[] arrayA = new int[elements];
        int[] arrayB = new int[elements];

        String[] secondline = br.readLine().split(" ");
        String[] thirdline = br.readLine().split(" ");
        br.close();
        for (int i = 0; i < elements; i++) {
            arrayA[i] = Integer.parseInt(secondline[i]);
            arrayB[i] = Integer.parseInt(thirdline[i]);
        }
        int smallest_same_element = arrayA[0];

        boolean found = false;
        for (int i = 0; i < elements; i++) {
            for (int j = 0; j < elements; j++) {
                if ((i != j) && (arrayA[i] == arrayA[j])) {
                    found = true;
                    if (arrayA[i] < smallest_same_element) {
                        smallest_same_element = arrayA[i];
                    }
                }
            }
        }
        int numberOfSteps = 0;
        boolean same = false;

        while ((same == false) && (isPositiveElement(arrayA) == true)) {
            for (int i = 0; i < elements; i++) {
                if ((found == false) || ((found == true) && (arrayA[i] != smallest_same_element))) {
                    arrayA[i] -= arrayB[i];
                    numberOfSteps += 1;
                }

            }
            same = isSameElement(arrayA);
        }
        if (same == false) {
            System.out.println(-1);
        } else if (same == true) {
            System.out.println(numberOfSteps);
        }

    }
}
