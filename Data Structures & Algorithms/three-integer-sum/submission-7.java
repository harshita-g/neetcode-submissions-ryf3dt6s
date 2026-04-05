class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length==0){
            return res;
        }
        //we will fix one value and treat the other two values in 
        //a similar way as two sum->tc:o(n^2)
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=n-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]>0){
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }
                else if(nums[i]+nums[l]+nums[r]==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(nums[l]==nums[l-1] && l<r){
                        l++;
                    }
                }
            }
        }
        return res;
        
    }
}
