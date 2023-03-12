package codewars.kaniosx;

public class PreviousMultipleOfThree {
    public static Integer prevMultOfThree(int n) {
        for (; n % 3 > 0; n /= 10);
        return n > 0 ? n : null;
    }
}
