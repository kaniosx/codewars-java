package codewars.kaniosx;

import java.util.ArrayList;
import java.util.List;

public class TextAlignJustify {
    public static String justify(String text, int width) {
        List<List<String>> lines = new ArrayList<>();
        List<String> line = new ArrayList<>();

        for (String word : text.split("\\s+")) {
            if (String.join(" ", line).length() + word.length() < width) {
                line.add(word);
            } else {
                lines.add(line);
                line = new ArrayList<>();
                line.add(word);
            }
        }

        lines.add(line);

        StringBuilder finalBuffer = new StringBuilder();

        int counter = 0;

        for (List<String> row : lines) {
            List<Integer> wages = new ArrayList<>();

            for (int i = 0; i < row.size() - 1; i++) {
                wages.add(1);
            }

            counter++;

            if (counter != lines.size()) {
                for (int i = 0; i < width - String.join(" ", row).length(); i++) {
                    if (wages.size() != 0) {
                        wages.set(i % wages.size(), wages.get(i % wages.size()) + 1);
                    }
                }
            }

            for (int i = 0; i < wages.size(); i++) {
                finalBuffer.append(row.get(i)).append(" ".repeat(Math.max(0, wages.get(i))));
            }

            finalBuffer.append(row.get(row.size() - 1)).append("\n");
        }

        finalBuffer.deleteCharAt(finalBuffer.length() - 1);

        return finalBuffer.toString();
    }
}