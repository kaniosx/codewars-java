package codewars.kaniosx;

public class CalculateAverage {

    public static double find_average(int[] array){
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
