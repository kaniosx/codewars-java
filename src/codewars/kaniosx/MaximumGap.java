package codewars.kaniosx;

import java.util.Arrays;

public class MaximumGap {

    public static int maxGap(int[] numbers) {
        int max = 0;
        int[] sorted = Arrays.stream(numbers).sorted().toArray();

        for (int i = sorted.length - 1; i > 0; i--) {
            if (sorted[i] - sorted[i - 1] > max) {
                max = sorted[i] - sorted[i - 1];
            }
        }

        return max;
    }
}
