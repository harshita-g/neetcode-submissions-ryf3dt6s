class Solution {
    public String minWindow(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        if(s_len<t_len){
            return "";
        }
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<t_len;i++){
            hmap.put(t.charAt(i),hmap.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character, Integer> window = new HashMap<>();

        int l=0;
        int r=0;
        int min_len=Integer.MAX_VALUE;
        int start_index=-1;
        int required = hmap.size();
        int formed=0;

        while(r<s_len){
            char ch=s.charAt(r);
            window.put(ch,window.getOrDefault(ch,0)+1);

            if(hmap.containsKey(ch) && window.get(ch).intValue()==hmap.get(ch).intValue()){
                formed++;
            }
            while(l<=r && formed==required){
                if(r-l+1<min_len){
                    min_len=r-l+1;
                    start_index=l;
                }
                char lchar = s.charAt(l);
                window.put(lchar,window.get(lchar)-1);
                if(hmap.containsKey(lchar) && window.get(lchar)<hmap.get(lchar)){
                    formed--;
                }
                l++;
            }
            r++;

        }

        return start_index==-1?"":s.substring(start_index,start_index+min_len);
        
    }
}
