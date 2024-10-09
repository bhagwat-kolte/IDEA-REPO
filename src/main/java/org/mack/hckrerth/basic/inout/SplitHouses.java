package org.mack.hckrerth.basic.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bhagwat Kolte
 *
 * You live in a village. The village can be represented as a line that contains
 *  grids. Each grid can be denoted as a house that is marked as
 *  or a blank space that is marked as .
 * A person lives in each house. A person can move to a grid if it is adjacent to that person.
 * Therefore, the grid must be present on the left and right side of that person.
 * Now, you are required to put some fences that can be marked as
 *  on some blank spaces so that the village can be divided into several pieces.
 *  A person cannot walk past a fence but can walk through a house.
 * You are required to divide the house based on the following rules:
 * A person cannot reach a house that does not belong to that specific person.
 * The number of grids each person can reach is the same and it includes the grid in which the house is situated.
 * In order to show that you are enthusiastic and if there are many answers, then you are required to print the one where most fences are placed.
 * Your task is to decide whether there is a possible solution. Print the possible solution.
 */
public class SplitHouses {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long nosOfTests = Long.parseLong(br.readLine().toString());
        String inputString = br.readLine().toString();

        char [] ch = inputString.toCharArray();
        int i;
        for (i = 0; i < nosOfTests-1; i++){
            if(ch[i] == 'H' && ch[i+1] == 'H'){
                System.out.println("NO");
                break;
            }
            if(ch[i] == '.'){
                ch[i] = 'B';
            }
        }

        if(i == nosOfTests-1){
            System.out.println("YES");
            for (int k = 0; k < ch.length; k++){
                if(ch[k] == '.'){
                    System.out.print('B');
                }else
                    System.out.print(ch[k]);
            }

        }

    }
}
