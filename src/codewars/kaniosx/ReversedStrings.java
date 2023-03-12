package codewars.kaniosx;

public class ReversedStrings {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        sb.append(str);
        sb.reverse();

        return sb.toString();
    }
}
