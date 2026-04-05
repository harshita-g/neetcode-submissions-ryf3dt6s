class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0 ;i <matrix.length;i++){
            if (target>=matrix[i][0]&& target<=matrix[i][matrix[i].length-1]){
                return bs(matrix[i],target);
            }
        }
        return false;
        
    }
    public boolean bs(int[] arr, int target){
        int high = arr.length-1;
        int low = 0;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if (target>arr[mid]){
                low = mid+1;

            }
            else if (target<arr[mid]){
                high = mid-1;

            }
            else{
                return true;

            }
        }
        return false;
    }
}
