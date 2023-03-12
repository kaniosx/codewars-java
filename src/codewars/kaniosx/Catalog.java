package codewars.kaniosx;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Catalog {
    public static String catalog(String s, String article) {
        List<String> result = new ArrayList<>();

        for (String line : s.split("\n\n")) {
            if (line.contains(article)) {
                result.add(
                        getName(line) + " > " + "prx: " + getPrx(line) + " qty: " + getQty(line)
                );
            }
        }

        if (result.isEmpty()) {
            return "Nothing";
        }

        return String.join("\n", result);
    }

    private static String getPrx(String line) {
        return "$" + extract(line, "prx");
    }

    private static String getName(String line) {
        return extract(line, "name");
    }

    private static String getQty(String line) {
        return extract(line, "qty");
    }

    private static String extract(String line, String key) {
        Matcher matcher = Pattern.compile(
                Pattern.quote("<" + key + ">") + "(.*?)" + Pattern.quote("</" + key + ">")
        ).matcher(line);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return "0";
    }
}