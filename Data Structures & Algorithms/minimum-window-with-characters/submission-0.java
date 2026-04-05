class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        int count=0;
        int l=0;
        int r=0;
        int startindex=-1;
        int min_len = Integer.MAX_VALUE;
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0;i<m;i++){
            if(!hmap.containsKey(t.charAt(i))){
                hmap.put(t.charAt(i),1);
            }
            else{
                hmap.put(t.charAt(i),hmap.get(t.charAt(i))+1);
            }
        }
        while(r<n){
            if(hmap.containsKey(s.charAt(r))){
                hmap.put(s.charAt(r),hmap.get(s.charAt(r))-1);
                if(hmap.get(s.charAt(r))>=0){
                    count++;
                }
            }
            while(count==m){
                if(r-l+1<min_len){
                    min_len=r-l+1;
                    startindex=l;
                }
                // hmap.put(s.charAt(l),hmap.get(s.charAt(l))-1);
                if(hmap.containsKey(s.charAt(l))){
                    hmap.put(s.charAt(l),hmap.get(s.charAt(l))+1);
                    if(hmap.get(s.charAt(l))>0){
                        count--;
                    }
                }
                l++;
                
            }
            r=r+1;
        }
        return startindex==-1?"":s.substring(startindex,startindex+min_len);
        
    }
}
