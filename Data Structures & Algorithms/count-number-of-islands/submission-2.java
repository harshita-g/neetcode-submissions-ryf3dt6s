class Solution {
    public int numIslands(char[][] grid) {
        //base case -> empty grid
        if(grid.length==0 && grid[0].length==0){
            return 0;
        }
        int r = grid.length;
        int c = grid[0].length;
        int count=0;
        boolean[][] visited = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    bfs(i,j,visited,grid,r,c);
                    count++;
                }
            }
        }
        return count;
        
    }
    public static void bfs(int i, int j, boolean[][] visited, char[][] grid, int r, int c){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i,j});
        visited[i][j]=true;
        // r+1,c;r-1,c;r,c+1;r,c-1
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curr_row = cur[0];
            int curr_col = cur[1];
            for(int[] d: dirs){
                int nr = curr_row+d[0];
                int nc = curr_col+d[1];
                if(nr>=0 && nr<r && nc>=0 && nc<c && grid[nr][nc]=='1' && visited[nr][nc]==false){
                    visited[nr][nc]=true;
                    q.add(new int[]{nr,nc});
                }

            }
        }
    }
}
