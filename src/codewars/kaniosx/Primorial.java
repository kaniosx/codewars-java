package codewars.kaniosx;

import java.math.BigInteger;

public class Primorial {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static String numPrimorial(int n) {
        int iter = 0;
        int point = 2;
        BigInteger primorial = BigInteger.ONE;

        while (iter < n) {
            if (isPrime(point)) {
                primorial = primorial.multiply(BigInteger.valueOf(point));
                iter++;
            }

            point++;
        }

        return primorial.toString();
    }
}
