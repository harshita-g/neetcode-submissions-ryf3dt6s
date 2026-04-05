class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hmap = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(!hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i),1);
            }
            else{
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(hmap.containsKey(t.charAt(i)) && hmap.get(t.charAt(i))>0){
                hmap.put(t.charAt(i),hmap.get(t.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
