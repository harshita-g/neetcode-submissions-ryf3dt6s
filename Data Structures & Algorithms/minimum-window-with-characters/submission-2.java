class Solution {
    public String minWindow(String s, String t) {
        //base case
        if(s.length()<t.length()){
            return "";
        }
        //this will tell me the start of my minimum window length
        int start=0;
        //tells the min length so far
        int min_len = Integer.MAX_VALUE; 
        int l=0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            hmap.put(t.charAt(i),hmap.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int formed = 0;
        int required = hmap.size();

        for(int r=0;r<s.length();r++){
            window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);

            if(hmap.containsKey(s.charAt(r)) && hmap.get(s.charAt(r)).intValue() == window.get(s.charAt(r)).intValue()){
                formed++;
            }

            while(formed==required){
                if((r-l+1)<min_len){
                    min_len = r-l+1;
                    start=l;
                }
                char l_char = s.charAt(l);
                window.put(l_char,window.get(l_char)-1);
                if(hmap.containsKey(l_char) && window.get(l_char)<hmap.get(l_char)){
                    formed--;
                }
                l++;
            }

        }
        return min_len==Integer.MAX_VALUE?"":s.substring(start,start+min_len);

        
    }
}
