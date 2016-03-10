package auditorium.karen_kochinyan.utils;

import java.security.InvalidParameterException;

public class Spiral {

    public static void main(String[] args) {
        int[][] matrix = createSpiralMatrix(5);
        print(matrix);
    }

    /**
     * For example, if odd_size is 7 then the result should be
     * the matrix described below:
     * <p>
     * 31 30 29 28 27 26 49
     * 32 13 12 11 10 25 48
     * 33 14 3  2  9  24 47
     * 34 15 4  1  8  23 46
     * 35 16 5  6  7  22 45
     * 36 17 18 19 20 21 44
     * 37 38 39 40 41 42 43
     *
     * @param size size of columns and rows
     * @throws InvalidParameterException will be thrown if the specified size is not a odd number
     */
    public static int[][] createSpiralMatrix(int size) throws InvalidParameterException {
        int[][] matrix = new int[size][size];
        int n = size * size;
        int k = 0;
        while (k <= size / 2) {
            if (k == size / 2) {
                matrix[size / 2][size / 2] = 1;
                return matrix;
            }
            for (int i = k; i <= size - k - 2; i++) {
                matrix[i][size - 1 - k] = n--;
            }
            for (int j = size - 1 - k; j > k; j--) {
                matrix[size - 1 - k][j] = n--;
            }
            for (int i = size - 1 - k; i > k; i--) {
                matrix[i][k] = n--;
            }
            for (int j = k; j < size - 1 - k; j++) {
                matrix[k][j] = n--;
            }
            k++;
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

