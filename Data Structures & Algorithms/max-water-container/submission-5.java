class Solution {
    public int maxArea(int[] heights) {
        int max_area = Integer.MIN_VALUE;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int l=Math.min(heights[i],heights[j]);
            int b=j-i;
            max_area=Math.max(max_area,l*b);
            if(heights[i]>=heights[j]){
                j--;
            }
            else if(heights[i]<heights[j]){
                i++;
            }
        }
        return max_area;
        
    }
}
