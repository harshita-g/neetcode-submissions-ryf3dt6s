class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max_len=0;
        HashSet<Character> hset = new HashSet<>();

        while(right<s.length()){
            if(!hset.contains(s.charAt(right))){
                hset.add(s.charAt(right));
                max_len = Math.max(hset.size(),max_len);
                right++;

            }
            else if(hset.contains(s.charAt(right))){
                hset.remove(s.charAt(left));
                left++;
            }
        }

        return max_len;


        
    }
}
