package codewars.kaniosx;

public class LongestRepetition {
    public static Object[] longestRepetition(String s) {
        if (s.isEmpty()) {
            return new Object[]{"", 0};
        }

        int maxStreak = 0;
        char maxChar = Character.MIN_VALUE;
        int currentStreak = 0;
        char currentChar = '.';

        for (int i = 0; i < s.length(); i++) {
            if (currentChar == s.charAt(i)) {
                currentStreak++;
            } else {
                currentStreak = 1;
                currentChar = s.charAt(i);
            }

            if (currentStreak > maxStreak) {
                maxChar = s.charAt(i);
                maxStreak = currentStreak;
            }
        }

        return new Object[]{String.valueOf(maxChar), maxStreak};
    }
}
