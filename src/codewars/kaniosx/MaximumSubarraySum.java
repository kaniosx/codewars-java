package codewars.kaniosx;

public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j <= arr.length; ++j) {
                int candidate = 0;

                for (int x = i; x < j; x++) {
                    candidate += arr[x];
                }
                if (candidate > result) {
                    result = candidate;
                }
            }
        }

        return result;
    }
}
