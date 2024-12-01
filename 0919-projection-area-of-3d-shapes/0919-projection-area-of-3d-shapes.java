class Solution {
    public int projectionArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += findMaxForRow(i, grid);
        }

        for (int i = 0; i < grid.length; i++) {
            sum += findMaxForColumn(i, grid);
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > 0) {
                    sum++;
                }
            }
        }
        return sum;
    }

    private int findMaxForColumn(int col, int[][] matrix) {
        int max = matrix[0][col];
        for (int i = 0; i < matrix.length; i++) {
            if (max < matrix[i][col]) {
                max = matrix[i][col];
            }
        }
        return max;
    }

    private int findMaxForRow(int row, int[][] matrix) {
        int min = matrix[row][0];
        for (int i = 1; i < matrix[row].length; i++) {
            if (min < matrix[row][i]) {
                min = matrix[row][i];
            }
        }
        return min;
    }
}