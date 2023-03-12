package codewars.kaniosx;

class BeforeAfterPrimes {

    public static long[] primeBefAft(long num) {
        long lower = 0;
        long higher = 0;

        for (int i = 1; i < num; i++) {
            if (lower == 0 && isPrime(num - i)) {
                lower = num - i;
            }

            if (higher == 0 && isPrime(num + i)) {
                higher = num + i;
            }

            if (lower != 0 && higher != 0) {
                break;
            }
        }

        return new long[]{lower, higher};
    }

    private static boolean isPrime(long num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}