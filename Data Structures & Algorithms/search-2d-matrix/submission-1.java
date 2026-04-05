//Bhoomikas solution 2
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length; 
        for (int i=0;i< row;i++){
            int col = matrix[i].length;
            int low =0;
            int high = (row*col)-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                int indrow = mid  / col;
                int indcol = mid  % col;

                if (target>matrix[indrow][indcol]){
                    low =mid+1;
                }
                else if (target< matrix[indrow][indcol]){
                    high = mid-1;
                }

                else if (matrix[indrow][indcol]== target){
                    return true;
                }           
            }
        }

        return false;
    }
}
