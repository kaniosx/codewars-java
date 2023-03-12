package codewars.kaniosx;

import java.util.ArrayList;

public class OddDigPrime {

    public static long[] onlyOddDigPrimes(long n) {
        ArrayList<Long> result = new ArrayList<>();

        for (long i = 3; i < n; i++) {
            if (hasOddDigits(i) && isPrime(i)) {
                result.add(i);
            }
        }

        long nextOne = 0;

        while (nextOne == 0) {
            if (hasOddDigits(n + 1) && isPrime(n + 1)) {
                nextOne = n + 1;
            }

            n++;
        }

        return new long[] { result.size(), result.get(result.size() - 1), nextOne };
    }

    private static boolean hasOddDigits(long n) {
        for (char digit : Long.toString(n).toCharArray()) {
            if (Character.getNumericValue(digit) % 2 == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPrime(long n) {
        for (long i = 2; i <= (long) Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}