class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        //tranpose the matrix
        for(int i = 0; i < size; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse the matrix , size/2 to stop at mid value for reversal.
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][size - 1 - j];
                matrix[i][size - 1 - j] = temp;
            }
        }
    }
}