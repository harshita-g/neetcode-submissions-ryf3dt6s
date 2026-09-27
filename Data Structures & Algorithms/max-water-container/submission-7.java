class Solution {
    public int maxArea(int[] heights) {
        int l =0;
        int r = heights.length-1;
        int maxwater =0;

        while(l<r){
            
            int length = Math.min(heights[l],heights[r]);
            int breadth = r -l;
            int area = length*breadth;
            maxwater = Math.max(maxwater,area);
            if(heights[l]<=heights[r])
            {
                l++;

            }
            else{
                r--;
            }

        }
        return maxwater;
        
    }
}
