class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            res.add(intervals[i]);
        }

        res.add(newInterval);
        Collections.sort(res, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        result.add(res.get(0));

        for (int i = 1; i < res.size(); i++) {
            int[] prev = result.get(result.size() - 1);
            int[] curr = res.get(i);

            if (curr[0] <= prev[1]) {
                // Merge overlapping
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                result.add(curr);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
