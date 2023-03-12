package codewars.kaniosx;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int value : classPoints) {
            sum += value;
        }
        return yourPoints > sum / classPoints.length;
    }
}
