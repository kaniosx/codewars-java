package codewars.kaniosx;

import java.util.Map;
import java.util.HashMap;

public class Greed{
    public static int greedy(int[] dice){
        int result = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        counter.put(1, 0);
        counter.put(2, 0);
        counter.put(3, 0);
        counter.put(4, 0);
        counter.put(5, 0);
        counter.put(6, 0);

        for (int i : dice) {
            counter.put(i, counter.get(i) + 1);
        }

        if (counter.get(1) >= 3 ) {
            result += 1000;
            counter.put(1, counter.get(1) - 3);
        }

        if (counter.get(1) > 0) {
            result += counter.get(1) * 100;
        }

        if (counter.get(2) >= 3 ) {
            result += 200;
        }

        if (counter.get(3) >= 3 ) {
            result += 300;
        }

        if (counter.get(4) >= 3 ) {
            result += 400;
        }

        if (counter.get(5) >= 3 ) {
            result += 500;
            counter.put(5, counter.get(5) - 3);
        }

        if (counter.get(5) > 0) {
            result += counter.get(5) * 50;
        }

        if (counter.get(6) >= 3 ) {
            result += 600;
        }

        return result;
    }
}
