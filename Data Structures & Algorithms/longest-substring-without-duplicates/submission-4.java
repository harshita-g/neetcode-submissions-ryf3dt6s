class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0;
        int max_len = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int r=0;r<n;r++){
            hmap.put(s.charAt(r),hmap.getOrDefault(s.charAt(r),0)+1);

            while(hmap.get(s.charAt(r))>1){
                hmap.put(s.charAt(l),hmap.get(s.charAt(l))-1);
                l++;


            }
            max_len = Math.max(max_len, r-l+1);

        }
        return max_len;
        
    }
}
