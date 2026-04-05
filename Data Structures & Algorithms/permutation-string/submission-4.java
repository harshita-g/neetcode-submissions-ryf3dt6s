class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        int[] freq = new int[26];

        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }

        int l = 0;
        for(int r=0;r<s2.length();r++){
            freq[s2.charAt(r)-'a']--;

            if((r-l+1)>s1.length()){
                freq[s2.charAt(l)-'a']++;
                l++;
            }
            if((r-l+1)==s1.length()){
                boolean match=true;
                for(int x:freq){
                    if(x!=0){
                        match=false;
                        break;
                    }
                }
                if(match){
                    return true;
                }

            }
        }
        return false;
        
    }
}
