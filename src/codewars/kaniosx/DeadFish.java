package codewars.kaniosx;

import java.util.ArrayList;

public class DeadFish {

    public static int[] parse(String data) {
        ArrayList<Integer> resultArrList = new ArrayList<Integer>();
        int result = 0;
        for (String letter : data.split("")) {
            switch (letter) {
                case "i":
                    result++;
                    break;
                case "d":
                    result--;
                    break;
                case "s":
                    result = result * result;
                    break;
                case "o":
                    resultArrList.add(result);
                    break;
            }
        }
        return resultArrList.stream().mapToInt(i -> i).toArray();
    }
}
