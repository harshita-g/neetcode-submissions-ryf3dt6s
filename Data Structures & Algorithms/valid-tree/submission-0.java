class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1){
            return false;
        }
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[n];

        if(hasCycle(graph,0,-1,visited)){
            return false;
        }
        for(boolean v:visited){
            if(!v){
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(List<List<Integer>> graph, int node, int parent, boolean[] visited){
        visited[node]=true;
        for(int neigh:graph.get(node)){
            if(!visited[neigh]){
                if(hasCycle(graph,neigh,node,visited)){
                    return true;
                }
            }
            else if(neigh!=parent){
                return true;
            }
        }
        return false;
    }
}
