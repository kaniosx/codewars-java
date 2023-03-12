package codewars.kaniosx;

public class Correct {

    public static String correct(String string) {
        string = string.replace('5', 'S')
                .replace('0', 'O')
                .replace('1', 'I');
        return string;
    }
}
