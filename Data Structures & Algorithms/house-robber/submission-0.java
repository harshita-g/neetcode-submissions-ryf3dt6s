class Solution {
    int[] t = new int[101];
    public int rob(int[] nums) {
        for(int i=0;i<t.length;i++){
            t[i]=-1;
        }

        return robFrom(nums,0);      
        
    }
    public int robFrom(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
        if(t[i]!=-1){
            return t[i];
        }
        int rob=nums[i]+robFrom(nums,i+2);
        int not_rob=robFrom(nums,i+1);

        t[i] = Math.max(rob,not_rob);
        return t[i];
    }
}
