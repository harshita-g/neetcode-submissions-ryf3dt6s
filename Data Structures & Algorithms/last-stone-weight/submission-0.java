class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int i=0;i<stones.length;i++){
            int s=stones[i];
            minheap.offer(-s);
        }
        while(minheap.size()>1){
            int first=minheap.poll();
            int second=minheap.poll();
            if(second>first){
                minheap.offer(first-second);
            }
        }
        minheap.offer(0);
        return Math.abs(minheap.peek());
        
    }
}
