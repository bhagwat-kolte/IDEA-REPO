package org.amol.hckrerth.basic.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Bhagwat Kolte
 *
 * Problem:
 * Bob has a playlist of N songs, each song has a singer associated with it (denoted by an integer)
 * Favourite singer of Bob is the one whose songs are the most on the playlist *
 * Count the number of Favourite Singers of Bob
 */
public class FavouriteSinger {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String noOfSongs = br.readLine();
        String namesOfSingers = br.readLine();

        if(Long.parseLong(noOfSongs) > 1){
            List<String> inputList = new ArrayList<>();
            inputList = Arrays.asList(namesOfSingers.split(" "));
            List<Long> listOfInteger = inputList.stream().map(Long::valueOf).collect(Collectors.toList());

            TreeMap<Long, Long> tmap = new TreeMap<Long, Long>();
            for (Long t : listOfInteger) {
                Long c = tmap.get(t);
                tmap.put(t, (c == null) ? 1 : c + 1);
            }

            List<Long> lst = new ArrayList<>(tmap.values());

            Long maxValue = lst.stream()
                    .max(Long::compareTo)
                    .get();
            int count = Collections.frequency(lst, maxValue);
            System.out.println(count);
        } else if (Integer.parseInt(noOfSongs) == 1) {
            System.out.println(1);
        }
    }
}
