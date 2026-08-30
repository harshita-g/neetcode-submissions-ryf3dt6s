class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i <nums.length;i++){
            hs.add(nums[i]);
        }

        ArrayList<Integer> set = new ArrayList<>(hs);
        int longest =0;
        
        for(int i = 0 ; i <set.size();i++){
            int num = set.get(i);
            
            if(!hs.contains(num-1)){
                int count = 1;
                while(hs.contains(num+1)){
                count++;
                num++;
                }
                longest = Math.max(longest,count);
            }
           
        }
        return longest;


        
    }
}
