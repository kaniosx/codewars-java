package codewars.kaniosx;

public class FindOutlier {

    static int find(int[] integers){
        int oddCounter = 0;
        int evenCounter = 0;
        int lastOdd = 0;
        int lastEven = 0;

        for (int i : integers)
        {
            if (i % 2 == 0){
                evenCounter++;
                lastEven = i;
            } else {
                oddCounter++;
                lastOdd = i;
            }

            if (evenCounter >= 2 && oddCounter != 0) return lastOdd;
            if (oddCounter >= 2 && evenCounter != 0) return lastEven;
        }

        return 0;
    }
}