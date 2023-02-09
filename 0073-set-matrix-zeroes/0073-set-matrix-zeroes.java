class Solution {
    public void setZeroes(int[][] matrix) {
        int colcheck = 1, row = matrix.length, col = matrix[0].length; // colcheck is set to true
        
        for(int i  = 0;i < row ; i++){
            if(matrix[i][0] == 0) colcheck = 0; //changed to false
            for(int j = 1; j < col ; j++){
                if(matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
        }
        
        for(int i = row-1 ; i >=0 ; i--){
            for(int j = col - 1; j>=1 ; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if(colcheck == 0) matrix[i][0] = 0;
        }
        
    }
}