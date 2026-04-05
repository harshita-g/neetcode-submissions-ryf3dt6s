class Solution {
    public int countComponents(int n, int[][] edges) {
        //creating an adj list from given [][] edges
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u =e[0];
            int v = e[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int count=0;
        //the number of times we restart bfs is the number of unconnected components we have
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,adj,visited);
                count++;
            }
        }
        return count;

    }
    public void bfs(int start, List<List<Integer>> adj, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start]=true;

        while(!q.isEmpty()){
            Integer u = q.poll();
            for(int v:adj.get(u)){
                if(!visited[v]){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }

    }
}
