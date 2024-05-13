/*
 * You are given an m x n binary matrix grid.
 * 
 * A move consists of choosing any row or column and toggling each value in that
 * row or column (i.e., changing all 0's to 1's, and all 1's to 0's).
 * 
 * Every row of the matrix is interpreted as a binary number, and the score of
 * the matrix is the sum of these numbers.
 * 
 * Return the highest possible score after making any number of moves (including
 * zero moves).
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * Output: 39
 * Explanation: 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 * Example 2:
 * 
 * Input: grid = [[0]]
 * Output: 1
 */
class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;// row
        int n = grid[0].length;// column
        int ans = m * (1 << (n - 1));

        for (int j = 1; j < n; j++) {
            int colCount = 0;
            for (int i = 0; i < m; i++) {
                colCount += grid[i][0] == 0 ? (grid[i][j] ^ 1) : grid[i][j];// checking if there is any need to toggle
                                                                            // the elemenst or not
            }
            if (colCount < m - colCount) {
                ans += (m - colCount) * (1 << (n - 1 - j));
            } else {
                ans += colCount * (1 << n - 1 - j);
            }
        }
        return ans;
    }
}

// https://leetcode.com/problems/score-after-flipping-matrix/?envType=daily-question&envId=2024-05-13
// https://leetcode.com/problems/score-after-flipping-matrix/solutions/5151989/java-solution-explained-in-hindi-2-approaches/?envType=daily-question&envId=2024-05-13

// https://youtu.be/qNwfc8UasKY?si=s9LM9O1IC0wqsBG5