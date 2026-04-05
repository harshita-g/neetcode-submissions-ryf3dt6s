class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length<=1){
            return 0;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int remove=0;
        int[] curr = intervals[0];
        int prev_end=curr[1];
        for(int i=1;i<intervals.length;i++){
            int[] temp = intervals[i];
            int curr_start=temp[0];
            int curr_end = temp[1];
            if(curr_start<prev_end){
                remove++;
                prev_end=Math.min(prev_end,curr_end);
            }
            else{
                prev_end=curr_end;
            }
        }
        return remove;
        
    }
}
