//harshita

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] max_l = new int[n];
        int[] max_r = new int[n];

        max_l[0]=height[0];
        max_r[n-1]=height[n-1];

        for(int i=1;i<n;i++){
            max_l[i] = Math.max(max_l[i-1],height[i]);
        }
        for(int j=n-2;j>=0;j--){
            max_r[j] = Math.max(max_r[j+1],height[j]);
        }

        int total_water = 0;

        for(int i=0;i<n;i++){
            total_water+=Math.min(max_l[i],max_r[i])-height[i];
        }

        return total_water;
        
    }
}
