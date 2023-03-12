package codewars.kaniosx;

import java.util.ArrayList;

public class Mobius {

    public static int mobius(long number) {
        int factorsCount = 2;

        for (long x : primesInRange(number)) {
            if (number % x == 0) {
                if (number % (x * x) == 0) {
                    return 0;
                }

                factorsCount++;
            }
        }

        if (factorsCount % 2 == 0) {
            return 1;
        }

        return -1;
    }

    private static ArrayList<Long> primesInRange(long n) {
        ArrayList<Long> result = new ArrayList<>();
        long fact = 1;

        for (long i = 2; i < n; i++) {
            fact *= i - 1;

            if ((fact + 1) % i == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
