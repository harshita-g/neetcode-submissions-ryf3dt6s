// harshita
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k>nums.length){
            return new int[0];
        }
        int n=nums.length;
        int[] res = new int[n-k+1];

        for(int l=0;l<n-k+1;l++){
            int max_val = Integer.MIN_VALUE;
            for(int r=l;r<l+k;r++){
                if(max_val<nums[r]){
                    max_val=nums[r];
                }
            }
            res[l]=max_val;
        }
        return res;
        
        
    }
}
