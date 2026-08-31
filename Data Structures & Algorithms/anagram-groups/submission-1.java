class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(int i = 0 ; i <strs.length;i++){
            int[] count = new int[26];
            String word = strs[i];
            for(int j = 0 ; j<word.length();j++){
                char ch = word.charAt(j);
                count[ch-'a']++;

            }
            String key = Arrays.toString(count);
            
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(word);

        }
        return new ArrayList<>(hm.values());
    }
}
