class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums){
            if(hs.contains(num)){
                return num;
            }
            hs.add(num);
        }
        
        return -1;
    }
}
//1. create a hashset to store numbers i have already seen 
//2. loop through every number in my nums
//3. if the number is in the hashet reurn that number 
//4. else, add it to the hashset
//5. eventually i will find one 
