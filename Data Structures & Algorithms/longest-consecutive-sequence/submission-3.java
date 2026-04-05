class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hset.add((nums[i]));
        }

        if(hset.size()==1){
            return 1;
        }

        int global_len=0;

        for(int i=0;i<nums.length;i++){
            int len=0;
            if(!hset.contains(nums[i]-1)){
                int curr = nums[i];
                len++;
                while(hset.contains(curr+1)){
                    len++;
                    curr=curr+1;
                
                }
            }
            global_len = Math.max(global_len,len);


        }
        return global_len;


        
    }
}
