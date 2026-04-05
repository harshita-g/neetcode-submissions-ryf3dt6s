//harshita
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> f_ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            // int target = -nums[i];
            int l = i+1;
            int r = n-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]>0){
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }
                else if(nums[i]+nums[l]+nums[r]==0){
                    f_ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    while(nums[l]==nums[l-1] && l<r){
                        l++;
                    }
                }
            }
            
        }
        return f_ans;
        
    }
}
