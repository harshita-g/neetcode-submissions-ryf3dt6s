/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals==null || intervals.size()==0){
            return 0;
        }
        Collections.sort(intervals,(a,b)->a.start-b.start);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i=0;i<intervals.size();i++){
            Interval meeting = intervals.get(i);
            if(!minheap.isEmpty() && meeting.start>=minheap.peek()){
                minheap.poll();
            }
            minheap.offer(meeting.end);
        }
        return minheap.size();
    }
}
