class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row=heights.length;
        int col=heights[0].length;

        boolean[][] p_arr = new boolean[row][col];
        boolean[][] a_arr = new boolean[row][col];

        for(int i=0;i<col;i++){
            dfs(0,i,p_arr,heights);
            dfs(row-1,i,a_arr,heights);
        }
        for(int j=0;j<row;j++){
            dfs(j,0,p_arr,heights);
            dfs(j,col-1,a_arr,heights);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(p_arr[i][j] && a_arr[i][j]){
                    res.add(Arrays.asList(i,j));
                }

            }

        }
        return res;

    }

    private void dfs(int r,int c,boolean[][] visited, int[][] heights){
        visited[r][c]=true;
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] d:directions){
            int nr = r+d[0];
            int nc = c+d[1];
            if(nr>=0 && nr<heights.length && nc>=0 && nc<heights[0].length &&
            !visited[nr][nc] && heights[nr][nc]>=heights[r][c]){
                dfs(nr,nc,visited,heights);
            }
        }
    }
}
