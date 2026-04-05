class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i],1);
            }
            else{
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);

        for(Map.Entry<Integer, Integer> entry:hmap.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()});
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = pq.poll()[0];
        }

        return res;
        
    }
}
