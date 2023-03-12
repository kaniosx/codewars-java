package codewars.kaniosx;

public class DigPow {

    public static long digPow(int n, int p) {
        int num = 0;

        for (String digit : String.valueOf(n).split("")) {
            num += Math.pow(Integer.parseInt(digit), p);
            p += 1;
        }

        if (num % n == 0) {
            return num / n;
        }

        return -1;
    }
}