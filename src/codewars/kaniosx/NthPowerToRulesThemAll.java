package codewars.kaniosx;

public class NthPowerToRulesThemAll {

    public static int modifiedSum(int[] array, int power) {
        int sum = 0;

        for (int elem : array) {
            sum += Math.pow(elem, power) - elem;
        }

        return sum;
    }
}
