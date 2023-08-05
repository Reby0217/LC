class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length, n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    void dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;

        if (i<0 || i>= m || j < 0 || j>= n) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }

        // turn (i,j) into water
        grid[i][j] = '0';
        // turn surrrounding area into water
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);

    }
}