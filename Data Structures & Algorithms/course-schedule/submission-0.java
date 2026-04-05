class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] inDegrees = new int[numCourses];

        for(int[] prereq:prerequisites){
            int course=prereq[0];
            int reqprereq = prereq[1];
            graph.get(reqprereq).add(course);
            inDegrees[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegrees[i]==0){
                q.add(i);
            }
        }

        int comp_course=0;

        while(!q.isEmpty()){
            int course = q.poll();
            comp_course++;

            for(int neigh:graph.get(course)){
                inDegrees[neigh]--;
                if(inDegrees[neigh]==0){
                    q.add(neigh);
                }
            }
        }

        return comp_course==numCourses;




        
    }
}
