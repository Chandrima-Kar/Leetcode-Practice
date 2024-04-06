/*
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same. Then return the
 * number of unique elements in nums.
 * 
 * Consider the number of unique elements of nums to be k, to get accepted, you
 * need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the
 * unique elements in the order they were present in nums initially. The
 * remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])// if there is an unique element
            {
                nums[j] = nums[i];// nums[j] should be update with that unique element else i++
                j++;// if there is an unique element
            }
        }
        return j;
    }
}

// Link- https://leetcode.com/problems/remove-duplicates-from-sorted-array/
/*
 * sol-
 * The code starts iterating from i = 1 because we need to compare each element
 * with its previous element to check for duplicates.
 * 
 * The main logic is inside the for loop:
 * 
 * If the current element nums[i] is not equal to the previous element nums[i -
 * 1], it means we have encountered a new unique element.
 * In that case, we update nums[j] with the value of the unique element at
 * nums[i], and then increment j by 1 to mark the next position for a new unique
 * element.
 * By doing this, we effectively overwrite any duplicates in the array and only
 * keep the unique elements.
 * Once the loop finishes, the value of j represents the length of the resulting
 * array with duplicates removed.
 * 
 * Finally, we return j as the desired result.
 */