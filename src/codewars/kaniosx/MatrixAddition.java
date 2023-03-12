package codewars.kaniosx;

public class MatrixAddition {

    public static int[][] matrixAddition(int[][] a, int[][] b) {
        if (a.length == 0 || a.length != b.length) {
            return null;
        }
        int arrLen = a.length;
        int[][] result = a;
        for (int i = 0; i < arrLen; i++) {
            for (int j = 0; j < arrLen; j++) {
                result[i][j] += b[i][j];
            }
        }
        return result;
    }
}
