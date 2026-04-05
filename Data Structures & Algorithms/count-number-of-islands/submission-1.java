class Solution {
    private void bfs(int ro, int co, int[][] vis, char[][] grid) {
        vis[ro][co] = 1; 
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ro, co)); 
        
        int n = grid.length; 
        int m = grid[0].length; 
        
        // Directions: up, right, down, left
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            Pair node = q.poll();
            int row = node.row; 
            int col = node.col;

            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i]; 
                int ncol = col + dcol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && 
                    grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1; 
                    q.add(new Pair(nrow, ncol)); 
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length; 
        int m = grid[0].length; 
        int[][] vis = new int[n][m];
        int cnt = 0; 

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (vis[row][col] == 0 && grid[row][col] == '1') {
                    cnt++; 
                    bfs(row, col, vis, grid); 
                }
            }
        }
        return cnt; 
    }
}

// Helper class to represent a cell
class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
