//harshita
class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0;
        int j=n-1;
        int max_area=Integer.MIN_VALUE;
        while(i<j){
            int l=Math.min(heights[i],heights[j]);
            int b = j-i;
            max_area = Math.max(max_area,l*b);

            if(heights[i]<=heights[j]){
                i++;
            }
            else if(heights[j]<heights[i]){
                j--;
            }

        }
        return max_area;
        
    }
}
