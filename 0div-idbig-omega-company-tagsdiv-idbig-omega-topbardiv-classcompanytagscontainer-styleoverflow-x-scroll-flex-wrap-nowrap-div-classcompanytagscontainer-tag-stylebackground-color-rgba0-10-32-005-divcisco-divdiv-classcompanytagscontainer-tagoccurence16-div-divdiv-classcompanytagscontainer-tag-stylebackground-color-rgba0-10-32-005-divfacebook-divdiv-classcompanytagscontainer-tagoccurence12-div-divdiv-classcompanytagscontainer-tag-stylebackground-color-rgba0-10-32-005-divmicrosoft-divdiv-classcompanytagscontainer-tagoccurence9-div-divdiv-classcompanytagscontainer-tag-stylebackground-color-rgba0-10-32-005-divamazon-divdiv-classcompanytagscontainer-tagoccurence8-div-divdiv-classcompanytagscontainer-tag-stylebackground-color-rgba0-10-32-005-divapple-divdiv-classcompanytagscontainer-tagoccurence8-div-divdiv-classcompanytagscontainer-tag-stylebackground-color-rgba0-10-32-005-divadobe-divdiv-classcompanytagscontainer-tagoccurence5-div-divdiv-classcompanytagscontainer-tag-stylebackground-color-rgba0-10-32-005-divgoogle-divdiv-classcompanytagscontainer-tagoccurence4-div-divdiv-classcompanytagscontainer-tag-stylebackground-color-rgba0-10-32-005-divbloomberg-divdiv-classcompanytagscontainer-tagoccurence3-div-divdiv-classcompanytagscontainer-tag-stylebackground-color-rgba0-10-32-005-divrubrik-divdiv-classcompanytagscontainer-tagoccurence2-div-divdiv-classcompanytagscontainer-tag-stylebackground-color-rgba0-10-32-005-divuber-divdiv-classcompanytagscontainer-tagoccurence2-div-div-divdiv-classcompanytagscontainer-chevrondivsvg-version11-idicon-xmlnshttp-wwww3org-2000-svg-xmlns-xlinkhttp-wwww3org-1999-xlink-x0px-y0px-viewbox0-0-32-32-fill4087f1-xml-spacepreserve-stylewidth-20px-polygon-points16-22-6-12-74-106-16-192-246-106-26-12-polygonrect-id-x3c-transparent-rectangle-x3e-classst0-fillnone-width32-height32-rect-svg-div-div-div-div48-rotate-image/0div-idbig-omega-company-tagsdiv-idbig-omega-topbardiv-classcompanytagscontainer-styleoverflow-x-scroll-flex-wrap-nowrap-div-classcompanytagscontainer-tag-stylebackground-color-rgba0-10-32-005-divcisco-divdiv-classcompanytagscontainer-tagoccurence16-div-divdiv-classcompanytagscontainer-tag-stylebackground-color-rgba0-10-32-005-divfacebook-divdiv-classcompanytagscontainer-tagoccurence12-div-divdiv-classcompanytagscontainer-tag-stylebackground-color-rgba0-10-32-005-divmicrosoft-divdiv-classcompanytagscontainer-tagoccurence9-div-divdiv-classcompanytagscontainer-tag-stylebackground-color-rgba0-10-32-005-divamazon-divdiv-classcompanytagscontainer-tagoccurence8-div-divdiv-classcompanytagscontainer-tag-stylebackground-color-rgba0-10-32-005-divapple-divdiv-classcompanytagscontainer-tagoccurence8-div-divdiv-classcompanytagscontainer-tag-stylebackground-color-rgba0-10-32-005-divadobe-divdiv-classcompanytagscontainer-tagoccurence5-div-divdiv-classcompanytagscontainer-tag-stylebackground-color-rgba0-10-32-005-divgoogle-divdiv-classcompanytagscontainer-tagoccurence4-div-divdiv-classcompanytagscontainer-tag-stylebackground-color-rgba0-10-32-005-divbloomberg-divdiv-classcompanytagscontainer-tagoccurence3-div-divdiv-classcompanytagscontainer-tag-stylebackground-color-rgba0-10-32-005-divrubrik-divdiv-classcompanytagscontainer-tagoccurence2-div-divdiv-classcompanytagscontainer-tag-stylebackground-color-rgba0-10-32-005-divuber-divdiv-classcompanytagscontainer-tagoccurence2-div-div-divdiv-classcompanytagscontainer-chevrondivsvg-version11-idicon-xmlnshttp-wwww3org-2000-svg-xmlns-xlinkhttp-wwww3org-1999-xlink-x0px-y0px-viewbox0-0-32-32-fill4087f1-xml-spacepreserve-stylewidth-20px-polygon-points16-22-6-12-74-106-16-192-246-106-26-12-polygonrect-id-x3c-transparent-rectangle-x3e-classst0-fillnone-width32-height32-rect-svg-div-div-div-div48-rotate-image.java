class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        //transpose the matrix first
        for(int i = 0; i < rows; i++){
            for(int j = i; j < cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //reverse the matrix till the mid of the matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][rows - 1 - j];
                matrix[i][rows - 1 - j] = temp;
            }
        }
    }
}