class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int max_freq = 0;
        int res = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int r=0;r<n;r++){
            hmap.put(s.charAt(r),hmap.getOrDefault(s.charAt(r),0)+1);
            max_freq = Math.max(max_freq,hmap.get(s.charAt(r)));
            
            //invalid window
            while((r-l+1)-max_freq>k){
                hmap.put(s.charAt(l),hmap.get(s.charAt(l))-1);
                l++;

            }
            res = Math.max(res,r-l+1);
        }
        return res;
        
    }
}
