class Solution {
    public int characterReplacement(String s, int k) {

        int l=0;
        // int r=0;
        int max_len=0;
        int max_freq=0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int r=0;r<s.length();r++){
            char c = s.charAt(r);
            hmap.put(c,hmap.getOrDefault(c,0)+1);
            max_freq = Math.max(max_freq,hmap.get(c));

            while((r-l+1)-max_freq>k){
                char left_char = s.charAt(l);
                hmap.put(left_char,hmap.get(left_char)-1);
                l++;
            }
            max_len = Math.max(max_len,r-l+1);
        }
        return max_len;
        
    }
}
