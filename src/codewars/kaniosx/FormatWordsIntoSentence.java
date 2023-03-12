package codewars.kaniosx;

import java.util.ArrayList;
import java.util.Arrays;

public class FormatWordsIntoSentence {

    public static String formatWords(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        wordsList.removeAll(Arrays.asList("", null));

        for (int i = 0; i < wordsList.size(); i++) {
            result.append(wordsList.get(i));

            if (i == wordsList.size() - 2) {
                result.append(" and ");
            } else if (i < wordsList.size() - 1) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}
