/*
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2:
 * 
 * Input: n = 1
 * Output: ["()"]
 */

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }

    public void recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }
        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }
}

// https://leetcode.com/problems/generate-parentheses/
/*
 * Python, Java w/ Explanation | Faster than 96% w/ Proof | Easy to Understand
 * 
 * IdealYuvi
 * Sep LeetCoding Challenge
 * 2283
 * 131542
 * Sep 07, 2022
 * Java
 * Python
 * Python3
 * Backtracking
 * 2+
 * The idea is to add ')' only after valid '('
 * We use two integer variables left & right to see how many '(' & ')' are in
 * the current string
 * If left < n then we can add '(' to the current string
 * If right < left then we can add ')' to the current string
 */

/*
 * (0, 0, '')
 * |
 * (1, 0, '(')
 * / \
 * (2, 0, '((') (1, 1, '()')
 * / \
 * (2, 1, '(()') (2, 1, '()(')
 * / \
 * (2, 2, '(())') (2, 2, '()()')
 * | |
 * res.append('(())') res.append('()()')
 */