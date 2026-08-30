class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] obj = new int[nums.length];
        
        int left = 1;
        for(int i = 0 ; i <nums.length;i++){
            obj[i]=left;
            left =left*nums[i];
        }
        int right = 1;
        for(int i = nums.length-1;i>=0;i--){
            obj[i] = obj[i]*right;
            right = right*nums[i];
        }

        return obj;
        
    }
}  
