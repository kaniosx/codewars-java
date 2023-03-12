package codewars.kaniosx;

import java.util.HashMap;
import java.util.Map;

public class FindTheUniqueNumber {

    public static double findUniq(double arr[]) {
        Map<Double, Integer> arrValues = new HashMap<>();

        for (double number : arr) {
            if (arrValues.containsKey(number)) {
                Integer count = arrValues.get(number);
                arrValues.put(number, count + 1);
            } else {
                arrValues.put(number, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : arrValues.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
