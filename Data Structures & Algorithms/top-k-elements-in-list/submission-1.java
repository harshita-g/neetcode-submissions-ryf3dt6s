class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i],0);
            }
            else{
                hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
            }
        }

        List<Map.Entry<Integer, Integer>> topk = new ArrayList<>(hmap.entrySet());

        topk.sort((a,b)->b.getValue().compareTo(a.getValue()));
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = topk.get(i).getKey();
        }
        return result;
       
        
    }
}
