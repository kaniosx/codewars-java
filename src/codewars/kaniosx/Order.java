package codewars.kaniosx;

import java.util.HashMap;

public class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        HashMap<Integer, String> result = new HashMap<>();
        StringBuilder finalString = new StringBuilder();

        for (String word : words.split(" ")) {
            Integer key = Integer.valueOf(word.replaceAll("\\D+",""));
            result.put(key, word);
        }

        for (String value : result.values()) {
            finalString.append(value).append(" ");
        }

        return finalString.toString().trim();
    }
}