class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> res = new ArrayList<>();
        
        //base case
        if(heights.length==0){
            return res;
        }
        int row = heights.length;
        int col=heights[0].length;
        //store the pacific coordinates
        // pacific->
        // 0,all cols
        // all rows,0

        // atlantic->
        // all rows,col-1
        // row-1,all cols
        //we will reverse the flow, and go uphill, we will check if water from the ocean can reach the cell
        //so we start at the ocean and move to the adjacent cells with an equal or greater height
        //populate pacific flow coordinates
        boolean[][] p_visited = new boolean[row][col];

        Queue<int[]> q = new LinkedList<>();
        //top row
        for(int c=0;c<col;c++){
            q.offer(new int[]{0,c});
            p_visited[0][c]=true;
        }

        //left most row
        for(int r=0;r<row;r++){
            q.offer(new int[]{r,0});
            p_visited[r][0]=true;
        }

        //atlantic
        Queue<int[]> aq = new LinkedList<>();
        boolean[][] av = new boolean[row][col];
        //bottom row
        for(int c=0;c<col;c++){
            aq.offer(new int[]{row-1,c});
            av[row-1][c]=true;
            
        }
        //right most
        for(int r=0;r<row;r++){
            aq.offer(new int[]{r,col-1});
            av[r][col-1]=true;
        }

        p_visited = bfs(row,col,q,heights,p_visited);
        av = bfs(row,col,aq,heights,av);

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(p_visited[i][j] && av[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;

    }

    public boolean[][] bfs(int row, int col, Queue<int[]> q, int[][] heights, boolean[][] visited){
        //(r,c)
        //up->r-1,c; down->r+1,c; left->r,c-1; right->r,c+1
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int curr_row = curr[0];
            int curr_col=curr[1];

            for(int[] d: dirs){
                int new_r = curr_row+d[0];
                int new_c = curr_col+d[1];

                if(new_r>=0 && new_r<row && new_c>=0 && new_c<col && !visited[new_r][new_c] && heights[new_r][new_c]>=heights[curr_row][curr_col]){
                    q.offer(new int[]{new_r,new_c});
                    visited[new_r][new_c]=true;
                }
            }
        }
        return visited;       

    }
}
