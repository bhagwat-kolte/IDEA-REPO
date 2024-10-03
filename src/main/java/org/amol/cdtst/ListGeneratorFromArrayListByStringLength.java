package org.amol.cdtst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Bhagwat Kolte
 *
 * Java Program to get List of Stings from given list of string, if the String length is divisible
 * by 3 or 4 (LTIMindTree).
 */
public class ListGeneratorFromArrayListByStringLength {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(
                "C:\\Git-Code\\IDEA-WS\\Java-17\\texts\\StringList.txt");
        Scanner sc = new Scanner(file);
        List<String> inputData = Arrays.asList(sc.nextLine().split(" "));
        System.out.println("Input String List");
        inputData.forEach(st -> System.out.print(st +" "));

        System.out.println();
        System.out.println();
        List<String> filteredStrings = inputData.stream()
                .filter(str -> str.length() % 3 == 0 || str.length() % 4 == 0).collect(Collectors.toList());

        System.out.println("Output String List");
        filteredStrings.forEach(st -> System.out.print(st +" "));
    }
}
