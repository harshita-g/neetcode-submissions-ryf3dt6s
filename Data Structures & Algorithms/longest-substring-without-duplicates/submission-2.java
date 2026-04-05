// harshita
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset = new HashSet<>();
        int l=0;
        int r=0;
        int max_len=0;
        while(r<s.length()){
            if(!hset.contains(s.charAt(r))){
                hset.add(s.charAt(r));
                max_len = Math.max(max_len,r-l+1);
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
