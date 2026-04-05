//bhoomika 
class Solution {
    public boolean isValid(String s) {
        ArrayList <Character> top = new ArrayList<>();
        for (int i = 0; i<s.length(); i++ ){
            char c = s.charAt(i);
            if (c =='{' || c == '(' || c == '[' ){
                top.add(c);

            }
            else{
                if (top.isEmpty()){
                     return false;
                }

                int n = top.size();
                char b = top.get(n-1);
                if (c == '}' && b =='{' ||c  ==  ')' && b =='(' ||c == ']' && b=='[' ){
                    top.remove(n-1);
                }
                else{
                    return false;
                }
            }
 
        }

        return top.isEmpty();
      
    }
}
