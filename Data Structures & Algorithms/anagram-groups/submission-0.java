class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();

        for(String word:strs){
            int[] arr = new int[26];
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                int idx = c-'a';
                arr[idx]++;

            }
            StringBuilder sb = new StringBuilder();
            for(int f:arr){
                sb.append(f).append('#');
            }
            String key = sb.toString();
            hmap.computeIfAbsent(key,k->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(hmap.values());
        
    }
}
