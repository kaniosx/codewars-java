package codewars.kaniosx;

import java.util.Locale;

public class AlternateCase {

    public static String toAlternativeString(String string) {
        StringBuilder result = new StringBuilder();

        for (String letter : string.split("")) {
            char point = letter.charAt(0);

            if (Character.isAlphabetic(point)) {
                if (Character.isUpperCase(point)) {
                    result.append(letter.toLowerCase());
                } else {
                    result.append(letter.toUpperCase());
                }
            } else {
                result.append(letter);
            }
        }

        return result.toString();
    }
}
