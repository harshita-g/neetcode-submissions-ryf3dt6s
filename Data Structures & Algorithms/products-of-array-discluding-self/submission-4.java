class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] res = new int[nums.length];
        //initialization of the arrays with 1
        for(int i=0;i<pre.length;i++){
            pre[i]=1;
            suf[i]=1;
        }
        // pre[1]=nums[0];
        //populate the pre array
        for(int i=1;i<pre.length;i++){
            pre[i] = pre[i-1]*nums[i-1];

        }
        //populate the suf array
        for(int i=suf.length-2;i>=0;i--){
            suf[i] = suf[i+1]*nums[i+1];
            
        }
        for(int i=0;i<nums.length;i++){
            res[i] = pre[i]*suf[i];

        }
        return res;

    }
}  
