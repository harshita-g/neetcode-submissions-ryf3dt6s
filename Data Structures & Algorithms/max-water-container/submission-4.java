class Solution {
    public int maxArea(int[] heights) {
        int max_area = Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int l = Math.min(heights[i],heights[j]);
                int b = j-i;
                max_area = Math.max(max_area,l*b);
            }
        }
        return max_area;
        
    }
}
