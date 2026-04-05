class Solution {
    public boolean isAnagram(String s, String t) {
        //base case
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i),1);
            }
            else{
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            }
        }

        for(int j=0;j<t.length();j++){
            if(hmap.containsKey(t.charAt(j)) && hmap.get(t.charAt(j))>0){
                hmap.put(t.charAt(j),hmap.get(t.charAt(j))-1);
            }
            else{
                return false;
            }
        }
        return true;

    }
}
