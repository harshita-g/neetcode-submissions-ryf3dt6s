class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        int[] curr = intervals[0];
        ans.add(curr);

        for(int[] interval:intervals){
            int prev_end = curr[1];
            int curr_start = interval[0];
            int curr_end = interval[1];

            if(curr_start<=prev_end){
                curr[1] = Math.max(prev_end,curr_end);
            }
            else{
                curr=interval;
                ans.add(curr);

            }

        }
        return ans.toArray(new int[ans.size()][]);
        
    }
}
