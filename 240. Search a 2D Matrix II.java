class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (target == matrix[row][col])// strating to check with first row last column element
                return true;
            else if (target < matrix[row][col])// if target is smaller we decrease col number
                col--;
            else
                row++;// else increase column number
        }
        return false;
    }
}