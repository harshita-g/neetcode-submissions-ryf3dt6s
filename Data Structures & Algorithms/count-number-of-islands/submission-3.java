class Solution {
    public int numIslands(char[][] grid) {
        //base case
        if(grid.length==0 && grid[0].length==0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int count=0;
        boolean[][] visited = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    bfs(i,j,visited,grid,row,col);
                    count++;
                }

            }
        }
        return count;
        
    }
    public void bfs(int i, int j, boolean[][] visited, char[][] grid, int row, int col){
        Queue<int[]>q = new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j]=true;
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int curr_row=curr[0];
            int curr_col=curr[1];

            for(int[] d: dirs){
                int nr = curr_row+d[0];
                int nc = curr_col+d[1];

                if(nr>=0 && nr<row && nc>=0 && nc<col && !visited[nr][nc] && grid[nr][nc]=='1'){
                    q.add(new int[]{nr,nc});
                    visited[nr][nc]=true;
                }
            }
        }


    }
}
