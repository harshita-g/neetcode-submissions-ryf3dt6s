class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        for (int i = 0 ; i <row;i++){
            int col = matrix[i].length;
            int low = 0;
            int high = (row*col)-1;
            
            while(low<=high){
                int mid = low+(high-low)/2;
                int rown = mid/col;
                int coln = mid%col;

                if (target< matrix[rown][coln]){
                    high = mid-1;
                    
                }
                else if (target> matrix[rown][coln]){
                    low=mid+1;

                }
                else if (target== matrix[rown][coln]){
                    return true;
                }

            }

        }
        return false;
        
    }
}
