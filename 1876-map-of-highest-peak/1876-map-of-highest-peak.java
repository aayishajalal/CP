class Solution {
    public int[][] highestPeak(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxVal = 2000;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] == 1) matrix[r][c] = 0;
                else matrix[r][c] = 1;
            }
        }
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] != 0) {
                    int top = maxVal;
                    int left = maxVal;
                    if (r - 1 >= 0) top = matrix[r - 1][c];
                    if (c - 1 >= 0) left = matrix[r][c - 1];
                    matrix[r][c] = Math.min(top, left) + 1;
                }
            }
        }
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (matrix[r][c] != 0) {
                    int bottom = maxVal;
                    int right = maxVal;
                    if (r + 1 < m) bottom = matrix[r + 1][c];
                    if (c + 1 < n) right = matrix[r][c + 1];
                    matrix[r][c] = Math.min(matrix[r][c], Math.min(bottom, right) + 1);
                }
            }
        }
        return matrix;
    }
}