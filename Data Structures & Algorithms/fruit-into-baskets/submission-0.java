// harshita
class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0;
        int r=0;
        int max_len = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        while(r<n){

            hmap.put(fruits[r],hmap.getOrDefault(fruits[r],0)+1);
            System.out.println("value"+fruits[r]);
            while(hmap.size()>2){
                hmap.put(fruits[l],hmap.get(fruits[l])-1);
                if(hmap.get(fruits[l])==0){
                    hmap.remove(fruits[l],0);
                }
                l++;
            }
            r++;
            System.out.println("value of r"+r);

            if(hmap.size()<=2){
                max_len = Math.max(r-l,max_len);

            }
        }
        return max_len;

        
    }
}