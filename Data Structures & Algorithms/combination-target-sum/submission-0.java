class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums, target, new ArrayList<>(),0);
        return result;        
    }
    public void backtrack(int[] nums, int target, List<Integer> path, int startindex){
        if(target==0){
            result.add(new ArrayList<>(path));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=startindex;i<nums.length;i++){
            path.add(nums[i]);
            backtrack(nums, target-nums[i],path,i);
            path.remove(path.size()-1);

        }
    }

}
