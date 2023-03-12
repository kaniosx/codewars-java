package codewars.kaniosx;

public class Vowels {

    private static final String VOWEL_STRING = "aeiouAEIOU";

    public static int getCount(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        int vowelsCount = 0;

        for (String letter : str.split("")) {
            if (VOWEL_STRING.contains(letter)) {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
