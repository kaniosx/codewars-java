package codewars.kaniosx;

// 7 kyu
public class HalvingSum {

    public int halvingSum(int n) {
        int result = 0;

        while (n > 0) {
            result += n;
            n /= 2;
        }

        return result;
    }
}
