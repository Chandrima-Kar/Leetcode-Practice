/*
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * 
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * Since an empty string reads the same forward and backward, it is a
 * palindrome.
 */

// APPROACH
/*
 * This code is an implementation of a solution to determine if a given string
 * is a palindrome. A string is considered a palindrome if it reads the same
 * forwards and backwards, ignoring spaces, punctuation, and letter casing.
 * 
 * The approach used in this solution is a two-pointer technique, where two
 * pointers are maintained, one at the start of the string and the other at the
 * end of the string. The two pointers move towards each other until they meet
 * in the middle of the string.
 * 
 * At each iteration of the while loop, the characters pointed to by the start
 * and last pointers are checked. If either of the characters is not a letter or
 * digit (e.g., a space or punctuation), the pointer is moved one step to the
 * right (for start) or one step to the left (for last) until a letter or digit
 * is found.
 * 
 * If both characters are letters or digits, they are converted to lowercase and
 * compared. If they are not equal, the function returns false, as the string is
 * not a palindrome. If they are equal, both pointers are moved one step to the
 * right and left, respectively.
 * 
 * The while loop continues until the start pointer is greater than the last
 * pointer, indicating that all the characters have been checked and that the
 * string is a palindrome. The function then returns true.
 */

class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;
        int j = s.length() - 1;
        int i = 0;
        while (i <= j) {
            char firstchar = s.charAt(i);
            char lastchar = s.charAt(j);
            if (!Character.isLetterOrDigit(firstchar))// if starting letter is space or punctuation we should skip it
                i++;
            else if (!Character.isLetterOrDigit(lastchar))// if ending letter is space or punctuation we should skip it
                j--;
            else {
                if (Character.toLowerCase(firstchar) != Character.toLowerCase(lastchar))// after converting to lowercase
                                                                                        // we need to chcek if they are
                                                                                        // equal or not
                    return false;
                i++;// if yes move the pointers
                j--;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/valid-palindrome/description/