package codewars.kaniosx;

public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;

            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == ch && count < k) {
                    sb.deleteCharAt(i);
                    i--;
                    count++;
                }
            }

            k -= count;

            if (k == 0) {
                break;
            }
        }

        return sb.toString();
    }
}
