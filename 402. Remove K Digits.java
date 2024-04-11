/*
 * Given string num representing a non-negative integer num, and an integer k,
 * return the smallest possible integer after removing k digits from num.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219
 * which is the smallest.
 * Example 2:
 * 
 * Input: num = "10200", k = 1
 * Output: "200"
 * Explanation: Remove the leading 1 and the number is 200. Note that the output
 * must not contain leading zeroes.
 * Example 3:
 * 
 * Input: num = "10", k = 2
 * Output: "0"
 * Explanation: Remove all the digits from the number and it is left with
 * nothing which is 0.
 */

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}
/*
 * sOLUTION:
 * Problem Explaination:
 * We have a string num representing non-negative integer and an integer k(k
 * digits to remove from num).
 * We need to remove k digits from num such that it's the smallest possible
 * integer after removing k digits from num.
 * 🧠Thinking Behind the Solution:
 * If you see my approach or others's approaches to solutions for this problem,
 * you will mostly find that most solutions use a greddy approach and stack to
 * solve this problem. But why a greedy approach with a stack chosen for solving
 * the "Remove K Digits" problem? The reason is:
 * Greedy Approach:
 * The problem requires us to minimize the resulting number by removing k digits
 * from the given number num.
 * A greedy approach is suitable because at each step (processing each digit),
 * we make a locally optimal choice (keeping the smallest possible digit) with
 * the aim of achieving the overall optimal solution (smallest resulting
 * number).
 * By prioritizing smaller digits for the most significant places (leftmost
 * positions), we ensure that the resulting number is minimized.
 * Use of Stack:
 * A stack is employed to facilitate the greedy decision-making process:
 * We traverse each digit of num and compare it with the top of the stack (the
 * most recent digit we've chosen to keep).
 * If the current digit is smaller than the top of the stack and we still have
 * removals (k > 0) remaining, we pop digits from the stack until a suitable
 * position for the current digit is found.
 * This stack-based approach allows us to maintain the order of digits while
 * dynamically removing larger, less significant digits to form the smallest
 * possible number.
 * ✅Approach:
 * Initialize an empty stack.
 * Traverse each digit of num.
 * For each digit, while the stack is not empty and k is greater than zero,
 * check if the current digit is smaller than the top of the stack. If so, pop
 * from the stack (remove the top digit) and decrement k.
 * Push the current digit onto the stack.
 * After processing all digits, handle remaining k (if any) by popping from the
 * stack.
 * Construct the resulting number from the stack and remove any leading zeros.
 * Return the smallest possible number as a string.
 * 
 */

// link-https://leetcode.com/problems/remove-k-digits/solutions/5005706/faster-lesser-detailed-explaination-stack-greedy-step-by-step-explaination-python-java-c/?envType=daily-question&envId=2024-04-11