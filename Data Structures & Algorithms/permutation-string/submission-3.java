class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int len = s1.length();

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sorted1 = new String(arr1);

        for(int i=0;i<=s2.length()-len;i++){
            String sub = s2.substring(i,i+len);

            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);
            String sortedsub = new String(arr2);

            if(sorted1.equals(sortedsub)){
                return true;
            }

        }
        return false;
        
    }
}
