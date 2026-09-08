class Solution {
    public int maxArea(int[] heights) {

            int l = 0;
            int r = heights.length-1;
            int area =0;
            while(l<r){
                int breadth= Math.min(heights[l],heights[r]);
                System.out.println(breadth);
                int length = r-l;
                area= Math.max(area,length*breadth);
                if(heights[l]<=heights[r]){
                    l++;
                }
                else{
                    r--;
                }
                
            }
            return area;
        
    }
}
