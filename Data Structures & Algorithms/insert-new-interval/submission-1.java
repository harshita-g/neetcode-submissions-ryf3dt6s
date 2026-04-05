class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //this will store all the intervals and the new interval as well
        int[][] updated = new int[intervals.length+1][];
        for(int i=0;i<intervals.length;i++){
            updated[i]=intervals[i];
        }
        updated[intervals.length]=newInterval;

        //now we need to sort the updated interval array based on the start time
        Arrays.sort(updated,(a,b)->Integer.compare(a[0],b[0]));
        int[] prev = updated[0];

        List<int[]> res = new ArrayList<>();
        res.add(prev);

        //now we will merge any overlapping intervals
        for(int i=0;i<updated.length;i++){
            int[] curr = updated[i];
            if(prev[1]>=curr[0]){
                prev[1] = Math.max(prev[1],curr[1]);
            }
            else{
                res.add(curr);
                prev=curr;
            }
        }
        return res.toArray(new int[res.size()][]);

        
    }
}
