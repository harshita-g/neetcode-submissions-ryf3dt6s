class Solution {
    public String foreignDictionary(String[] words) {
        HashMap<Character, Set<Character>> graph = new HashMap<>();
        HashMap<Character, Integer> indegree = new HashMap<>();

        //initialize all the characters
        for(String word:words){
            for(char ch:word.toCharArray()){
                graph.putIfAbsent(ch,new HashSet<>());
                indegree.putIfAbsent(ch,0);
            }
        }

        //build the graph
        for(int i=0;i<words.length-1;i++){
            String w1 = words[i];
            String w2 = words[i+1];

            //invalid case
            if(w1.length()>w2.length() && w1.startsWith(w2)){
                return "";

            }

            int len = Math.min(w1.length(),w2.length());

            for(int j=0;j<len;j++){
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);

                if(c1!=c2){
                    if (!graph.get(c1).contains(c2)) {
                    //add edge only once
                        graph.get(c1).add(c2);
                        indegree.put(c2,indegree.get(c2)+1);
                }
                break;
            }
        }
      
    }
    //BFS
    Queue<Character> q = new LinkedList<>();
    for(char ch: indegree.keySet()){
        if(indegree.get(ch)==0){
            q.offer(ch);
        }
    }
    StringBuilder sb = new StringBuilder();
    while(!q.isEmpty()){
        char curr = q.poll();
        sb.append(curr);
        for(char nei: graph.get(curr)){
            indegree.put(nei, indegree.get(nei)-1);

            if (indegree.get(nei) == 0) {
                q.offer(nei);
            }
        }
    }
    //cycle detection
    if (sb.length() != indegree.size()) {
        return "";
    }
    return sb.toString();

    }

}
