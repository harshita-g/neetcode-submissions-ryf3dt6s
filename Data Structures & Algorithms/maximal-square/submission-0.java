//brute force
class Solution {
    public int maximalSquare(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int maxside=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]=='1'){
                    int side=1;
                    while(i+side<=r && j+side<=c && isvisited(i,j,matrix,side)){
                        maxside = Math.max(maxside,side);
                        side++;
                    }
                }
            }
        }
        return maxside*maxside;        
    }
    public boolean isvisited(int row, int col, char[][] matrix, int side){
        for(int i=row;i<row+side;i++){
            for(int j=col;j<col+side;j++){
                if(matrix[i][j]!='1'){
                    return false;
                }
            }
        }
        return true;
    }
}