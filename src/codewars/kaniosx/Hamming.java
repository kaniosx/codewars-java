package codewars.kaniosx;

import java.util.Arrays;
import java.util.TreeSet;

public class Hamming {

    public static long hamming(int n) {

        TreeSet<Long> treeSet = new TreeSet<>(Arrays.asList(2L, 3L, 5L));
        long low = 1;

        for (int i = 1; i < n; i++) {
            low = treeSet.pollFirst();

            treeSet.add(2 * low);
            treeSet.add(3 * low);
            treeSet.add(5 * low);
        }

        return low;
    }
}