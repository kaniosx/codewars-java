package codewars.kaniosx;

public class OddOrEven {

    public static String oddOrEven (int[] array) {
        if (array.length == 0) {
            return "even";
        }

        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum % 2 == 0 ? "even" : "odd";
    }
}
