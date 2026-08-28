class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        for(int i = 0 ;i <s.length();i++){
            char c= s.charAt(i);
            smap.put(c,(smap.getOrDefault(c,0)+1));
        }
        for(int i = 0 ;i <t.length();i++){
            char c= t.charAt(i);
            tmap.put(c,(tmap.getOrDefault(c,0)+1));
        }

        return smap.equals(tmap);


    }
}
