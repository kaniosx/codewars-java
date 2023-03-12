package codewars.kaniosx;

import java.util.ArrayList;

class Progression {

    public static String arithmeticSequenceElements(int a, int d, long n) {
        ArrayList<String> sequence = new ArrayList<>();
        int iterator = 0;

        while (iterator < n) {
            sequence.add(Integer.toString(a + iterator * d));
            iterator++;
        }

        return String.join(", ", sequence);
    }

}
