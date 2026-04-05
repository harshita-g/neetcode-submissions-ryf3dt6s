//harshita
class Solution {
    public int maxArea(int[] heights) {
        int max_area = Integer.MIN_VALUE;
        int n=heights.length;
        int area=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int l = Math.min(heights[i],heights[j]);
                int b = j-i;
                area = l*b;
                max_area=Math.max(max_area,area);

            }
        }
        return max_area;
        
    }
}
