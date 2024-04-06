class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int rev = 0;
        int y = x;
        while (y > 0) {
            int r = y % 10;
            rev = rev * 10 + r;
            y = y / 10;
        }
        if (rev == x)
            return true;
        return false;
    }
}

// https://leetcode.com/problems/palindrome-number/
