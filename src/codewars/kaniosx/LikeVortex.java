package codewars.kaniosx;

import java.util.ArrayList;

public class LikeVortex {

    public static int[][] rotateLikeAVortex(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n / 2; i++) {
            int p = n - 2 * i - 1; // cells in ring part count

            for (int j = 0; j < p; j++) {
                result[i][i + j] = matrix[i + p - j][i];
                result[i + p - j][i] = matrix[i + p][i + p - j];
                result[i + p][i + p - j] = matrix[i + j][i + p];
                result[i + j][i + p] = matrix[i][i + j];
            }
        }

        if (n % 2 == 1) {
            result[n / 2][n / 2] = matrix[n / 2][n / 2];
        }

        printMatrix(result);
        return result;
    }


    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }

            System.out.println();
        }
    }
}
