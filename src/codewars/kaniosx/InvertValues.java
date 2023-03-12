package codewars.kaniosx;

public class InvertValues {

    public static int[] invert(int[] array) {
        int[] res = new int[array.length];
        int cnt = 0;

        for (int el : array) {
            res[cnt] = -el;
            cnt++;
        }

        return res;
    }
}
