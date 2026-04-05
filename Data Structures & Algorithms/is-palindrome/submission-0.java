class Solution {
    public boolean isPalindrome(String s) {
        s=s.strip();
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        int i=0;
        int j=s.length()-1;
        System.out.println(s);
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
                // i++;
                // j--;
            }
            i++;
            j--;
            // return false;
        }
        return true;
        
    }
}
