package lc;

public class LeetCode867 {
    public int[][] transpose(int[][] matrix) {
        // Step 1: Get the dimensions of the original matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 2: Create a new matrix with swapped dimensions
        int[][] transposed = new int[cols][rows];

        // Step 3: Map the original elements to the new matrix positions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        // Step 4: Return the newly constructed matrix
        return transposed;
    }
}
