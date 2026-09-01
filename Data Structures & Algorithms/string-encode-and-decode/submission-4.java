class Solution {

    public String encode(List<String> strs) {
        //first i need toconvert list of strings to one string
        String s ="";
        for(int i = 0 ; i <strs.size();i++){
            String word = strs.get(i);
            int n = word.length();
            s+= (n+"#"+word);
        }
        return s;

    }

    public List<String> decode(String str) {
        //after encoding i want to decode 

    ArrayList<String> arr = new ArrayList<>();
    int i = 0;
    while(i<str.length()){
        int j=i;
        while(str.charAt(j) !='#'){
            j++;
        }
        int len = Integer.parseInt(str.substring(i,j));
        arr.add(str.substring(j+1,j+1+len));
        i=j+1+len;
    }
    return arr;

    }
}
