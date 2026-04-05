class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String s:strs){
            encodedString.append(s.length()).append('#').append(s);
        }
        return encodedString.toString();


    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j = str.indexOf('#',i);
            int length = Integer.parseInt(str.substring(i,j));
            i=j+1;
            decodedString.add(str.substring(i,i+length));
            i+=length;
        }
        return decodedString;

    }
}
