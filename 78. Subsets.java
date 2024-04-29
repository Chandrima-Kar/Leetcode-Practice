/*
 * Given an integer array nums of unique elements, return all possible
 * subsets
 * (the power set).
 * 
 * The solution set must not contain duplicate subsets. Return the solution in
 * any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * Example 2:
 * 
 * Input: nums = [0]
 * Output: [[],[0]]
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int t = nums.length;
        int length = (int) Math.pow(2, t) - 1;
        List<List<Integer>> fin = new ArrayList();
        for (int i = 0; i <= length; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < t; j++) {
                if (((i >> j) & 1) == 1) {
                    temp.add(nums[j]);
                }
            }
            fin.add(temp);
        }
        return fin;
    }
}
// https://takeuforward.org/data-structure/power-set-print-all-the-possible-subsequences-of-the-string/
// https://leetcode.com/problems/subsets/
// https://youtu.be/b7AYbpM5YrE?si=KjBcPPb4-Gwj7_my
