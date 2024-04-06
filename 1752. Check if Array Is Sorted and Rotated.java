/*
 * Intuition
 * Functionality:
 * 
 * It takes an array of integers (nums) as input.
 * It returns true if the array can be formed by rotating a sorted array at most
 * once, false otherwise.
 * -PLS UPVOTE , GET MY LINKEDIN IN COMMENTS.
 * Key Idea:
 * 
 * A sorted array rotated at most once can have at most one "dip" or inversion
 * (where a larger element precedes a smaller element).
 * The code checks for this condition and ensures there's no more than one such
 * inversion.
 * Approach
 * The provided code effectively checks whether a given array can be formed by
 * rotating a sorted array at most once. Here's a breakdown of its functionality
 * and logic:
 * 
 * Steps:
 * 
 * Iterating Through the Array:
 * 
 * int count = 0: Initializes a counter count to track the number of inversions
 * encountered.
 * The for loop iterates through the array from index 0 to nums.length - 2
 * (excluding the last element):
 * if (nums[i] > nums[i + 1]):
 * If the current element (nums[i]) is greater than the next element (nums[i +
 * 1]), it indicates an inversion.
 * The counter count is incremented.
 * Handling Wrap-Around Case:
 * 
 * if (nums[0] < nums[nums.length - 1]):
 * This condition checks for a special case where the inversion might occur at
 * the array's ends due to rotation.
 * If the first element (nums[0]) is smaller than the last element
 * (nums[nums.length - 1]), it signifies a potential inversion caused by
 * rotation.
 * The counter count is incremented only once for this specific scenario.
 * Checking for Valid Rotations:
 * 
 * return count <= 1:
 * The code returns true if count is less than or equal to 1. This implies that
 * there's either no inversion (sorted array) or at most one inversion (valid
 * rotation).
 * It returns false if count is greater than 1, indicating more than one
 * inversion, which wouldn't be possible with a valid rotation of a sorted
 * array.
 */
class Solution {
    public boolean check(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                c++;
        }
        if (nums[0] < nums[nums.length - 1])
            c++;
        return (c <= 1);

    }
}

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/