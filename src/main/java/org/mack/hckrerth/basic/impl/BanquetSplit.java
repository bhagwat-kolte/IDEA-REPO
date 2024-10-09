package org.mack.hckrerth.basic.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Bhagwat Kolte
 *
 * BanquetSplit: Java program to split people in two Banquet halls. but two people having any relationship
 * should not be placed in same hall.
 * ensuring that no two people who know each other end up in the same banquet, otherwise print No. If the answer is No
 * in the next line, print 2 integers, the minimum number of relationships to remove so that everyone gets an invite,
 * and the number of ways to do so.
 */
public class BanquetSplit {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());
        int noOfPeople = Integer.parseInt(sc.nextLine());

        HashSet<Integer> hallA = new HashSet<>();
        HashSet<Integer> hallB = new HashSet<>();

        int [][] rel = new int[noOfPeople][noOfPeople];
        for (int i = 0; i < noOfPeople; i++){
            for (int j = 0; j < noOfPeople; j++){
                rel[i][j] = 0;
            }
        }
        for(int i = 0; i < 4; i++){
            String[] temp = sc.nextLine().split(" ");
            int a = Integer.parseInt(temp[0]) - 1;
            int b = Integer.parseInt(temp[1]) -1;
            rel[a][b] = 1;
        }

        for (int i = 0; i < noOfPeople; i++){
            for (int j = 0; j < noOfPeople; j++){
                if (rel[i][j] != 0){
                    hallA.add(i + 1);
                    hallA.add(j + 1);
                }
            }
        }

    }
}
