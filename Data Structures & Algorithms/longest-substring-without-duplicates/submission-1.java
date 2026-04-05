class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        int l=0;
        int max_len=0;
        HashSet<Character> hset = new HashSet<>();
        while(r<s.length()){
            if(!hset.contains(s.charAt(r))){
                hset.add(s.charAt(r));
                max_len = Math.max(max_len,hset.size());
                r++;
            }
            else if(hset.contains(s.charAt(r))){
                hset.remove(s.charAt(l));
                l++;
            }
        }
        return max_len;


        
    }
}
