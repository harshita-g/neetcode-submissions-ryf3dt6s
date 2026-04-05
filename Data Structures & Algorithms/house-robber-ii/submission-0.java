class Solution {
    int[] t = new int[101];
    public int rob(int[] nums) {
        for(int i=0;i<t.length;i++){
            t[i]=-1;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==0){
            return 0;
        }
        int case1= robfrom(nums,0,nums.length-2);
        for(int i=0;i<t.length;i++){
            t[i]=-1;
        }
        int case2= robfrom(nums,1,nums.length-1);

        return Math.max(case1,case2);
        
    }
    public int robfrom(int[] nums, int start, int end){
        if(start>end){
            return 0;
        }
        if(t[start]!=-1){
            return t[start];
        }
        int rob=nums[start]+robfrom(nums,start+2,end);
        int not_rob=robfrom(nums,start+1,end);

        t[start] = Math.max(rob,not_rob);

        return t[start];
    }
}
