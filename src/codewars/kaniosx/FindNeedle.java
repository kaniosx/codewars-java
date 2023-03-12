package codewars.kaniosx;

import java.util.Arrays;

public class FindNeedle {

    public static String findNeedle(Object[] haystack) {
        String pattern = "found the needle at position ";

        return pattern + Arrays.asList(haystack).indexOf("needle");
    }
}
