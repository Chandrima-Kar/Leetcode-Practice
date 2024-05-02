/*
 * Given an integer array nums that does not contain any zeros, find the largest
 * positive integer k such that -k also exists in the array.
 * 
 * Return the positive integer k. If there is no such integer, return -1.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-1,2,-3,3]
 * Output: 3
 * Explanation: 3 is the only valid k we can find in the array.
 * Example 2:
 * 
 * Input: nums = [-1,10,6,7,-7,1]
 * Output: 7
 * Explanation: Both 1 and 7 have their corresponding negative values in the
 * array. 7 has a larger value.
 * Example 3:
 * 
 * Input: nums = [-10,8,6,7,-2,-3]
 * Output: -1
 * Explanation: There is no a single valid k, we return -1.
 */

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        int maxK = Integer.MIN_VALUE;
        while (l < r) {
            if (nums[l] + nums[r] == 0) {
                maxK = Math.max(nums[r], maxK);
                l++;
                r--;
            } else if ((nums[l] + nums[r]) < 0)
                l++;
            else
                r--;
        }
        return maxK != Integer.MIN_VALUE ? maxK : -1;
    }
}