package src.pepCoding.BackTracking;

public class MatrixComparisonWithRecursion {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        boolean areEqual = areMatricesEqual(matrix1, matrix2);

        if (areEqual) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }
    }

    public static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        // Check if dimensions are the same
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }

        return compareMatrices(matrix1, matrix2, 0, 0);
    }

    public static boolean compareMatrices(int[][] matrix1, int[][] matrix2, int row, int col) {
        // Base case: If we reach the end of both matrices, they are equal.
        if (row == matrix1.length) {
            return true;
        }

        // Compare the current elements
        if (matrix1[row][col] != matrix2[row][col]) {
            return false; // Matrices are not equal
        }

        // Move to the next element
        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == matrix1[0].length) {
            nextRow++;
            nextCol = 0;
        }

        // Recursively compare the next element
        return compareMatrices(matrix1, matrix2, nextRow, nextCol);
    }
}