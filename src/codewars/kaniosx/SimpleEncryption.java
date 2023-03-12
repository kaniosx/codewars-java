package codewars.kaniosx;

import java.util.Arrays;

public class SimpleEncryption {

    public static char[] getCharListFromText (String text) {
        return text.toCharArray();
    }

    public static String newTextFromCharArray (char[] arr) {
        String partOne = "";
        String partTwo = "";

        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 0) partOne += arr[i-1];
            else partTwo += arr[i-1];
        }

        return partOne + partTwo;
    }

    public static String encrypt(final String text, final int n) {
        if (n <= 0 || text == "" || text == null) return text;

        String newText = newTextFromCharArray(
                getCharListFromText(text)
        );

        int newN = n - 1;

        return encrypt(newText, newN);
    }

    public static String decryptionTextFromCharArray (char[] arr) {
        char[] partOne = Arrays.copyOfRange(arr, 0, arr.length/2);
        char[] partTwo = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        String newText = "";

        for (int i = 0; i < arr.length/2; i++) {
            newText += "" + partTwo[i] + partOne[i];
        }

        if (arr.length % 2 != 0) newText += partTwo[arr.length/2];

        return newText;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (n <= 0 || encryptedText == "" || encryptedText == null) return encryptedText;

        String newText = decryptionTextFromCharArray(
                getCharListFromText(encryptedText)
        );

        int newN = n - 1;

        return decrypt(newText, newN);
    }
}
