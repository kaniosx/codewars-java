package codewars.kaniosx;

import java.util.ArrayList;

public class StringSplit {

    public static String[] solution(String s) {
        ArrayList<String> result = new ArrayList<>();

        if (s.length() % 2 != 0) {
            s += "_";
        }

        char[] asChar = s.toCharArray();

        for (int i = 0; i < s.length(); i += 2) {
            result.add(Character.toString(asChar[i]) + asChar[i + 1]);
        }

        return result.toArray(new String[0]);
    }
}
