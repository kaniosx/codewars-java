package codewars.kaniosx;

import java.util.*;

public class ArrayLeaders {

    public static List arrayLeaders(int[] numbers)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int sum = Arrays.stream(numbers).sum();

        for (int i = 0; i < numbers.length - 1; i++) {
            sum -= numbers[i];

            if (numbers[i] > sum) {
                result.add(numbers[i]);
            }
        }

        if (numbers[numbers.length - 1] > 0) {
            result.add(numbers[numbers.length - 1]);
        }

        return result;
    }
}
