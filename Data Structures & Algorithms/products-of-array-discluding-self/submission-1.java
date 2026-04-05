class Solution {
    public int[] productExceptSelf(int[] nums) {
        // brute force solution is: tc:O(n^2)
        int[] ans=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int prod=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             prod*=nums[j];
        //         }
        //     }
        //     ans[i]=prod;
        // }
        // return ans;

        //optimal solution is this
        int[] prefix = new int[nums.length];
        int[] sufix = new int[nums.length];
        prefix[0]=1;
        sufix[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            sufix[i]=sufix[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix[i]*sufix[i];
        }
        return ans;



        
    }
}  
