class Solution {
    public int longestConsecutive(int[] nums) {
        // no duplicates so hashset
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        ArrayList<Integer> set = new ArrayList<>(s);
        int longest=0;
        for(int i =0;i <set.size();i++){
            int num = set.get(i);
            if(!s.contains(num-1)){
                int count = 1;

                while(s.contains(num+1)){
                    count++;
                    num++;

                }
             longest= Math.max(longest,count);
            }
           
        }

        return longest;
        
        
    }
}
