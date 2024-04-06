/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If
 * reversing x causes the value to go outside the signed 32-bit integer range
 * [-231, 231 - 1], then return 0.
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed or
 * unsigned).
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: x = 123
 * Output: 321
 * Example 2:
 * 
 * Input: x = -123
 * Output: -321
 * Example 3:
 * 
 * Input: x = 120
 * Output: 210
 */

class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            if (rev > (Integer.MAX_VALUE - r) / 10) {// checking for overflow
                return 0;
            }
            rev = rev * 10 + r;
            n = n / 10;
        }
        return (x > 0) ? (rev) : (-rev);
    }
}

// https://leetcode.com/problems/reverse-integer/description/