package codewars.kaniosx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Digitize {
    public static int[] digitize(long n) {
        List<Integer> result = new ArrayList<>();
        List<String> stringList = Arrays.asList(String.valueOf(n).split(""));

        Collections.reverse(stringList);

        for (String elem : stringList) {
            result.add(Integer.valueOf(elem));
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}