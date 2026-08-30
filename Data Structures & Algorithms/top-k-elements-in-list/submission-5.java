class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] res = new int[k];
        for(int i = 0 ; i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        //descnenidng order --> max heap

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)-> hm.get(b)-hm.get(a));
        //list of keys 
        ArrayList<Integer> arr = new ArrayList<>(hm.keySet());
        for(int i =0 ; i <arr.size();i++){
            heap.add(arr.get(i));
        }


        for(int i =0;i<k;i++){
            res[i]=heap.poll();

        }
        return res;
        
    }
}
