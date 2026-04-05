class Solution {
    public int countComponents(int n, int[][] edges) {
        //make adj list first
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int count=0;
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,adj,visited);
                count++;
            }
        }
        return count;

    }
    public void bfs(int i, List<List<Integer>> adj, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i]=true;
        while(!q.isEmpty()){
            int u = q.poll();
            for(int v:adj.get(u)){
                if(!visited[v]){
                    q.add(v);
                    visited[v]=true;
                }
            }
        }
    }
}
