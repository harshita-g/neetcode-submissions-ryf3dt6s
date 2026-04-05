class Solution {
    public boolean validTree(int n, int[][] edges) {
        //base case
        if(edges.length!=n-1){
            return false;
        }

        //make adj list
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        int count=0;
        //bfs
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0]=true;
        count++;
        while(!q.isEmpty()){
            int u = q.poll();
            // int u = curr[0];
            for(int v:adj.get(u)){
                if(visited[v]!=true){
                    q.add(v);
                    visited[v]=true;
                    count++;
                }
            }
        }
        return count==n;


    }
}
