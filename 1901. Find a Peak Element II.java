/*
 * A peak element in a 2D grid is an element that is strictly greater than all
 * of its adjacent neighbors to the left, right, top, and bottom.
 * 
 * Given a 0-indexed m x n matrix mat where no two adjacent cells are equal,
 * find any peak element mat[i][j] and return the length 2 array [i,j].
 * 
 * You may assume that the entire matrix is surrounded by an outer perimeter
 * with the value -1 in each cell.
 * 
 * You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.
 */

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;// row
        int n = mat[0].length;// col
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int ind = peak(mat, m, mid);// sending matrix,no of rows, middle column to dinf the largest elemnt in that
                                        // particular column
            int left = mid - 1 >= 0 ? mat[ind][mid - 1] : -1;// to find the adjacent values of the largest elemnt in the
                                                             // middle column
            int right = mid + 1 < n ? mat[ind][mid + 1] : -1;
            if (mat[ind][mid] > left && mat[ind][mid] > right)
                return new int[] { ind, mid };
            else if (mat[ind][mid] < left) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return new int[] { -1, -1 };
    }

    int peak(int[][] mat, int row, int mid) {
        int max = -1, index = -1;
        for (int i = 0; i < row; i++) {
            if (mat[i][mid] > max) {
                max = mat[i][mid];
                index = i;
            }
        }
        return index;
    }
}

// Problem
// Link:https://leetcode.com/problems/find-a-peak-element-ii/description/
// https://youtu.be/nGGp5XBzC4g?si=4-I85BSMVJYkkzgP