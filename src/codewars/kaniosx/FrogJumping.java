package codewars.kaniosx;

public class FrogJumping {

    public static int solution(int[] a) {
        int jumps = 0;
        int position = 0;
        int test = 0;

        try {
            while (jumps < a.length) {
                position += a[position];
                jumps++;
                test = a[position];
            }
        } catch (ArrayIndexOutOfBoundsException $exception) {
            return jumps;
        }

        return -1;
    }
}
