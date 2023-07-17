class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length, INF = m+n;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (mat[row][col]==0) continue;
                int top = INF, left = INF;
                if (row >= 1) {
                    top = mat[row - 1][col];
                }
                if (col >= 1) {
                    left = mat[row][col - 1];
                }
                mat[row][col] = Math.min(top, left) + 1;
            }
        }

        for (int row = m - 1; row >= 0; row--) {
            for (int col = n - 1; col >= 0; col--) {
                if (mat[row][col]==0) continue;
                int bottom = INF, right = INF;
                if (row < m - 1) {
                    bottom = mat[row + 1][col];
                }
                if (col < n - 1) {
                    right = mat[row][col + 1];
                }
                mat[row][col] = Math.min(mat[row][col], Math.min(bottom, right) + 1);
            }
        }
        return mat;
    }
}