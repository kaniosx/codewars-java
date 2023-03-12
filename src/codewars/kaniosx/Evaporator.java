package codewars.kaniosx;

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int result = 0;
        double full = content;
        while (content > full * threshold / 100) {
            content *= 1 - evap_per_day / 100;
            result++;
        }
        return result;
    }
}
