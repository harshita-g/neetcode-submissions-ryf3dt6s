class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        boolean flag=false;

        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i],i);
            }
            else if(hmap.containsKey(nums[i])){
                int l = hmap.get(nums[i]);
                if(Math.abs(l-i)<=k){
                    flag=true;
                }
                else{
                    hmap.put(nums[i],i);
                }
            }
        }
        return flag;
        
    }
}