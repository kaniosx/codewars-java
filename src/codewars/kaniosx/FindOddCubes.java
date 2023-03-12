package codewars.kaniosx;

public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num * num * num;
            }
        }
        return sum;
    }
}
