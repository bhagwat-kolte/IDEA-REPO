package mack.hckrerth.basic.inout;

import java.io.*;

/**
 * @author Bhagwat Kolte
 *
 * You are conducting a contest at your college. This contest consists of two problems and n participants.
 * You know the problem that a candidate will solve during the contest. *
 * You provide a balloon to a participant after he or she solves a problem.
 * There are only green and purple-colored balloons available in a market.
 * Each problem must have a balloon associated with it as a prize for solving that specific problem.
 * You can distribute balloons to each participant by performing the following operation:
 * Use green-colored balloons for the first problem and purple-colored balloons for the second problem
 * Use purple-colored balloons for the first problem and green-colored balloons for the second problem
 * You are given the cost of each balloon and problems that each participant solve.
 * Your task is to print the minimum price that you have to pay while purchasing balloons.
 */
public class CostOfBalloons {
    public static void main(String[] args) throws IOException {

//        File file = new File("C:\\Git-Code\\IDEA-WS\\Java-17\\texts\\inp.txt");
//        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nos = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < nos; i++){
            String[] str = br.readLine().split(" ");
            int colorOne = Integer.parseInt(str[0]);
            int colorTwo = Integer.parseInt(str[1]);
            int participant = Integer.parseInt(br.readLine());
            int [] part1 = new int[participant];
            int [] part2 = new int[participant];
            int count = 0;
            for (int j = 0; j < participant; j++){
                String[] input = br.readLine().split(" ");
                part1[count] = Integer.parseInt(input[0]);
                part2[count] = Integer.parseInt(input[1]);
                count++;
            }
            int nous1 = 0;
            int nous2 = 0;
            for( int k = 0; k < participant; k++){
                nous1 = nous1 + part1[k];
                nous2 = nous2 + part2[k];
            }

            int case1 = (nous1 * colorOne) + (nous2 * colorTwo);
            int case2 = (nous1 * colorTwo) + (nous2 * colorOne);

            if(case1 <= case2)
                System.out.println(case1);
            else
                System.out.println(case2);

        }

    }
}
