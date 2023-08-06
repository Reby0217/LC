class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if (grid == null || grid.length == 0) {
            return -1;
        }
        for (int i = 0; i<m; i++) {
            for (int j = 0; j< n; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, i, j, 2);
                }
            }
        }

        int minutes = 2;
        for (int[] row: grid) {
            for (int cell : row) {
                if (cell == 1) {
                    return -1;
                }
                minutes = Math.max(minutes, cell);
            }
        }
        return minutes-2;
    }
    private void dfs(int[][] grid, int i, int j, int minutes) {
        int m = grid.length, n = grid[0].length;
        if (i<0 || i>= m|| j<0 || j>= n) {
            return;
        }

        if (grid[i][j] == 0 || (1< grid[i][j] && grid[i][j] < minutes)) {
            return;
        }

        grid[i][j] = minutes;
        minutes++;
        dfs(grid, i+1,j, minutes);
        dfs(grid, i-1,j, minutes);
        dfs(grid, i,j+1, minutes);
        dfs(grid, i,j-1, minutes);
    }
}