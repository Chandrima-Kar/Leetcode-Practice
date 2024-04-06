/*
 * Given an integer array nums, rotate the array to the right by k steps, where
 * k is non-negative.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int x = nums.length;
        k = k % x;
        if (k <= 0) {
            k += x;
        }
        reverse(nums, 0, x - k - 1);
        reverse(nums, x - k, x - 1);
        reverse(nums, 0, x - 1);
    }

    public static void reverse(int[] nums, int i, int j) {
        int li = i;
        int ri = j;
        while (li < ri) {
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            li++;
            ri--;
        }
    }
}

// link-https://leetcode.com/problems/rotate-array/
// sol-https://leetcode.com/problems/rotate-array/solutions/1730142/java-c-python-a-very-very-well-detailed-explanation/