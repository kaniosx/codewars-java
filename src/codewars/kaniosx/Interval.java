package codewars.kaniosx;

import java.util.HashSet;
import java.util.Set;

public class Interval {

    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Set<Integer> insidePoints = new HashSet<>() ;

        for (int[] interval : intervals) {
            for (int i = interval[0]; i < interval[1]; i++) {
                insidePoints.add(i);
            }
        }

        return insidePoints.size();
    }
}