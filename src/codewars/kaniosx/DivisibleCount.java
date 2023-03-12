package codewars.kaniosx;

public class DivisibleCount {

    public static long divisibleCount(long x, long y, long k) {
        if (x == y) {
            if (x % k == 0) {
                return 1;
            }

            return 0;
        }

        long lower = x;
        long higher = y;

        for (long i = x; i <= y; i++) {
            if (i % k == 0) {
                lower = i;
                break;
            }
            if (i == y) {
                return 0;
            }
        }

        for (long i = y; i >= x; i--) {
            if (i % k == 0) {
                higher = i;
                break;
            }
        }

        return (higher - lower) / k + 1;
    }
}