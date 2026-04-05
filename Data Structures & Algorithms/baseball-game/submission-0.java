class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0 ; i <operations.length;i++){
            
            if (operations[i].equals("+")){
               s.add(s.get(s.size()-1)+s.get(s.size()-2));
            }
            else if (operations[i].equals("C")){
                s.pop();
            }
            else if (operations[i].equals("D")){
                s.add(s.get(s.size() - 1) * 2);
            }
            else {
                s.add(Integer.parseInt(operations[i]));
            }

        }
        int count =0;
        for (int i = 0 ; i <s.size();i++){
            count+=s.get(i);
            
        }
        return count;
        
    }
}