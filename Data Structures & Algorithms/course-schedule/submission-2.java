class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] pre: prerequisites){
            int course = pre[0];
            int prereq = pre[1];
            adj.get(prereq).add(course);
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int comp_course=0;

        while(!q.isEmpty()){
            int course = q.poll();
            comp_course++;
            for(int v:adj.get(course)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                }
            }
        }
        return comp_course==numCourses;

    }
}
