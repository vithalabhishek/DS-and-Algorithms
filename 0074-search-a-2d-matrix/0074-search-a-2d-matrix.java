class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Optimal Solution for Leetcode
        if(matrix.length == 0) return false;
        
        int n = matrix.length, m = matrix[0].length;
        
        int low = 0, high = (n * m) - 1;
        //Applying binary search
        while(low <= high){
            int mid = (low + high)/2;
            if(matrix[mid/m][mid % m] == target) //mid/m gives row and mid % m give column
                return true;
            else if(matrix[mid/m][mid % m] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
}