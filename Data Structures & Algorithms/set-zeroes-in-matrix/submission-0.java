class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean[] store_row=new boolean[row];
        boolean[] store_col=new boolean[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    store_row[i]=true;
                    store_col[j]=true;
                }
            }
        }
        for(int i=0;i<row;i++){
            if(store_row[i]){
                for(int j=0;j<col;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<col;j++){
            if(store_col[j]){
                for(int i=0;i<row;i++){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
