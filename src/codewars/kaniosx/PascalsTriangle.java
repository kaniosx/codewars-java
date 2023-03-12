package codewars.kaniosx;

import java.util.ArrayList;

public class PascalsTriangle {

    public static int[][] pascal(int depth) {
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 1; i <= depth; i++) {
            ArrayList<Integer> line = new ArrayList<>();
            int x = 1;
            for (int j = 1; j <= i; j++) {
                line.add(x);
                x = x * (i - j) / j;
            }

            result.add(line.stream().mapToInt(n -> n).toArray());
        }

        int[][] resultAsArray = new int[result.size()][];
        int i = 0;

        for (int[] n : result) {
            resultAsArray[i++] = n;
        }

        return resultAsArray;
    }
}
