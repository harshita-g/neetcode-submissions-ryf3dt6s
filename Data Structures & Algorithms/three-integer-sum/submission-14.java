class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //if already there dont add
        // if not there then add
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i <nums.length;i++){
            int l = i+1;
            int r = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            while(l<r){
                int sum = nums[i]+ nums[l]+nums[r];
                    if(sum<0){
                        l++;
                        
                    }
                    else if(sum>0){
                        r--;

                    }
                    else{
                        ArrayList<Integer> n = new ArrayList<>();
                        n.add(nums[i]);
                        n.add(nums[l]);
                        n.add(nums[r]);
                        res.add(n);
                        l++;
                        r--;

                        while(l<r && nums[l]==nums[l-1]){
                            l++;
                        }
                         while(l<r && nums[r]==nums[r+1]){
                            r--;
                        }
                    }

                
            }
            
        }
    return res;
        
    }
}
