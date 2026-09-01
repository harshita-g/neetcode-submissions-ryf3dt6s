class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for(int i = 0 ; i <strs.length;i++){
            String word = strs[i];
            int[] count = new int[26];
            for(int j = 0 ; j <word.length();j++){
                char ch = word.charAt(j);
                count[ch-'a']++;
            }
            String key = Arrays.toString(count);
            hm.putIfAbsent(key, new ArrayList<String>());
            hm.get(key).add(word);
        }


       //return value of hashmap 
        return new ArrayList<>(hm.values());
        
    }
}
