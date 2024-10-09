package org.mack.hckrerth.basic.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

/**
 * @author Bhagwat Kolte
 *
 * You are given an array A of n elements. Now you need to choose the best index of this array
 * . An index of the array is called best if the special sum of this index is maximum across the special
 * sum of all the other indices.
 */
public class BestArrayIndexFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nos = Integer.parseInt(br.readLine());
        String [] elements = br.readLine().split(" ");
        Integer [] ints = new Integer[nos];
        for (int k = 0; k < nos; k++)
            ints[k] = Integer.parseInt(elements[k]);

        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nos; i++){
            int sum = ints[i];
            List<Integer[]> arrlst = new ArrayList<>();
            Integer[] subArray = Arrays.copyOfRange(ints, (i + 1), nos);
            int len = subArray.length;
            int count = 2;
            while(len >= count){
                arrlst.add(Arrays.copyOfRange(subArray, 0, count));
                subArray = Arrays.copyOfRange(subArray, count, len);
                len = len - count;
                count++;
            }
            for (int j = 0; j < arrlst.size(); j++){
                Integer[] temp = arrlst.get(j);
                int sum1 = 0;
                for (int m = 0; m < temp.length; m++){
                    sum1 = sum1 + temp[m];
                }
                sum = sum + sum1;
            }
            myMap.put(i, sum);
        }
        Optional<Map.Entry<Integer, Integer>> maxEntry = myMap.entrySet().stream().max(Map.Entry.comparingByValue());
        Integer maxValue = maxEntry.get().getValue();

        System.out.println(maxValue);
    }
}
