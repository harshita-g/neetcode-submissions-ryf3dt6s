class Solution {
    public int maxArea(int[] heights) {
        int max_area=0;
        int start=0;
        int end = heights.length-1;
        while(start<end){
            max_area = Math.max(max_area,(Math.min(heights[start],heights[end])* (end-start)));
            if(heights[start]<heights[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max_area;
        
    }
}
