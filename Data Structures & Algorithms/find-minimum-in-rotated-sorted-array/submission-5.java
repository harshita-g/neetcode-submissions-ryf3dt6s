class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int min = 0;

        while(l<=r){
            if(nums[l]<=nums[r]){
                return nums[l];
            }
            int mid = l+(r-l)/2;
            min=nums[mid];

            if(nums[mid]>=nums[l]){
                l=mid+1;
                min = Math.min(min,nums[mid]);
            }
            else{
                r=mid;
                min=Math.min(min,nums[mid]);
            }

        }
        return min;
        
    }
}
