package mack.hckrerth.basic.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Bhagwat Kolte
 *
 * You are given a table with n rows and m columns. Each cell is colored with white or black. Considering the shapes
 * created by black cells, what is the maximum border of these shapes? Border of a shape means the maximum number of
 * consecutive black cells in any row or column without any white cell in between. A shape is a set of connected
 * cells. Two cells are connected if they share an edge. Note that no shape has a hole in it.
 */
public class MaximumBordersFinder {
    public static void main(String[] args) throws IOException {

        Map<Integer, Map<String, List<String>>> inputData = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long nosOfTests = Long.parseLong(br.readLine().toString());

        for (int i = 1; i <= nosOfTests; i++){
            String tabelPr = br.readLine().toString();
            List<String> colRows = Arrays.asList(tabelPr.split(" "));
            Long nosOfRows = Long.parseLong(colRows.get(0).toString());
            Long nosOfCol = Long.parseLong(colRows.get(1).toString());
            List<String> inputList = new ArrayList<>();
            for (int m = 1; m <= nosOfRows; m++){
                inputList.add(br.readLine().toString());
            }
            Map<String, List<String>> tempMap= new HashMap<>();
            tempMap.put(tabelPr, inputList);
            inputData.put(i, tempMap);
        }

        for (Map.Entry<Integer, Map<String, List<String>>> entry : inputData.entrySet()){
            Map<String, List<String>> tempMap= new HashMap<>();
            tempMap = entry.getValue();


            for (Map.Entry<String, List<String>> entry1 : tempMap.entrySet()){
                List<String> lst = new ArrayList<>();
                lst = entry1.getValue();
                int count = 0;
                for (String tst: lst){
                    int tempCnt = 0;
                    for (int l = 0; l < tst.length(); l++){
                        if(tst.charAt(l) == '#'){
                            tempCnt = tempCnt + 1;
                        }
                    }
                    if (tempCnt > count)
                        count = tempCnt;
                }
                System.out.println(count);
            }
        }
    }
}
