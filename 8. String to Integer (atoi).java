/*
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit
 * signed integer (similar to C/C++'s atoi function).
 * 
 * The algorithm for myAtoi(string s) is as follows:
 * 
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-'
 * or '+'. Read this character in if it is either. This determines if the final
 * result is negative or positive respectively. Assume the result is positive if
 * neither is present.
 * Read in next the characters until the next non-digit character or the end of
 * the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no
 * digits were read, then the integer is 0. Change the sign as necessary (from
 * step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
 * then clamp the integer so that it remains in the range. Specifically,
 * integers less than -231 should be clamped to -231, and integers greater than
 * 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 */

class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int sign = 1;
        int i = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if (s.length() == 0)
            return 0;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        while (i < s.length() && s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' >= 0) {
            int digit = s.charAt(i) - '0';
            if (ans > max / 10 || (ans == max / 10 && digit > max % 10))
            /*
             * max/10: This expression calculates one-tenth of the maximum integer value.
             * This value is significant because it's the maximum value that ans can have
             * without risking overflow when appending another digit.
             * ans > max/10: This condition checks if adding another digit to ans would
             * result in an overflow situation. If ans is already greater than max/10,
             * adding another digit would cause it to exceed the maximum integer value.
             */
            {
                return (sign == 1) ? max : min;
            }
            ans = ans * 10 + digit;
            i++;
        }
        return ans * sign;
    }
}

// https://leetcode.com/problems/string-to-integer-atoi/
/*
 * Approach
 * Handling Empty String:
 * 
 * if (s.length() == 0): Checks if the input string s is empty. If so, it
 * returns 0 as there's no numerical content.
 * Skipping Leading Whitespaces:
 * 
 * while (i < s.length() && s.charAt(i) == ' '): The while loop iterates through
 * characters (s.charAt(i)) as long as they are whitespaces (' ') and the index
 * i is within the string bounds. This skips any leading whitespaces before the
 * potential number.
 * Handling Optional Sign:
 * 
 * if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')): Checks if
 * the first non-whitespace character (s.charAt(i)) is a sign ('-' or '+').
 * if (s.charAt(i) == '-'): If it's a minus sign, the sign variable is set to -1
 * to indicate a negative number.
 * i++: Increments the index i to move past the optional sign.
 * Converting Digits:
 * 
 * while (i < s.length() && s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' >= 0):
 * The while loop iterates through characters as long as they are valid digits
 * (between '0' and '9') and the index i is within the string bounds.
 * int digit = s.charAt(i) - '0': Converts the current character (assumed to be
 * a digit) to its corresponding integer value by subtracting the ASCII value of
 * '0'.
 * Overflow Handling:
 * if (ans > max / 10 || (ans == max / 10 && digit > max % 10)): This condition
 * checks for potential overflow situations for positive numbers. It compares
 * the current accumulated value (ans) with the maximum integer value (max)
 * divided by 10 (considering the next digit) and the remainder (max % 10). If
 * ans is already greater than the maximum divided by 10, or if ans is equal to
 * the maximum divided by 10 and the current digit (digit) is greater than the
 * remainder, it signifies overflow.
 * return (sign == 1) ? max : min;: In case of overflow, the code returns the
 * maximum positive value (max) if the sign is positive (sign == 1) or the
 * minimum negative value (min) if the sign is negative. This behavior is
 * consistent with some C/C++ library functions for string-to-integer
 * conversion.
 * ans = ans * 10 + digit: If no overflow, the current digit is incorporated
 * into the accumulated value (ans) by multiplying it by 10 (shifting existing
 * digits left) and adding the current digit.
 * i++: Increments the index i to move to the next character for processing.
 * Returning the Result:
 * 
 * return ans * sign: After processing all valid digits, the final ans is
 * multiplied by the sign (1 for positive, -1 for negative) and returned as the
 * converted integer value.
 */