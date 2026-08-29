class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] res = new int[k];
        for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> h= new PriorityQueue<>((a,b)-> hm.get(b)-hm.get(a));

    for (int key: hm.keySet()){
        h.add(key);
    }

        for(int i = 0;i<k;i++){
            res[i]=h.poll();

        }
        return res;

        
    }
}
