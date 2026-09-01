class Solution {

    public String encode(List<String> strs) {
        //lengthhashstring
        String s = "";
        for(int i = 0 ; i <strs.size();i++){
            String w = strs.get(i);
            int n = w.length();
            s+=(n+"#"+w);

        }
        return s;
    }

    public List<String> decode(String str) {
        //my first thing will be a number n and #
        //from that number count next n chars 
        //add it to a list
        //continue
        
        ArrayList<String> arr = new ArrayList<>();
        int i=0;
        while(i<str.length()){

            int j =i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            arr.add(str.substring(j+1,j+1+len));
            i=j+1+len;
            

        }
        return arr;

    }
}
