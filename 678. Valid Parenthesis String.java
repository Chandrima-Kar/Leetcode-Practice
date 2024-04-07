/*
 * Given a string s containing only three types of characters: '(', ')' and '*',
 * return true if s is valid.
 * 
 * The following rules define a valid string:
 * 
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left
 * parenthesis '(' or an empty string "".
 */
class Solution {
    public boolean checkValidString(String s) {
        int c1 = 0, c2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c1++;
                c2++;
            } else if (s.charAt(i) == ')') {
                c1--;
                c2--;
            } else {
                c1++;
                c2--;
            }

            if (c1 < 0)
                return false;
            if (c2 < 0)
                c2 = 0;
        }
        return c2 == 0;
    }
}

// link-https://leetcode.com/problems/valid-parenthesis-string/
/*
 * Approach
 * Variables Initialization:
 * p1: Keeps track of the count of open parentheses '('.
 * p2: Keeps track of the count of open parentheses '(' plus any '*'
 * encountered, which can represent either an open parenthesis '(' or a closing
 * parenthesis ')'.
 * int p1=0,p2=0;
 * Iteration over the String:
 * The method iterates over each character of the input string s using a for
 * loop.
 * for(int i=0;i<s.length();i++)
 * Character Check:
 * If the character is '(', both p1 and p2 are incremented because '(' increases
 * the count of both open parentheses '(' and open parentheses '(' plus '*'.
 * If the character is ')', both p1 and p2 are decremented because ')' decreases
 * the count of both open parentheses '(' and open parentheses '(' plus '*'.
 * If the character is '', p1 is incremented because '' can act as an open
 * parenthesis '('. However, p2 is decremented because '*' can also act as a
 * closing parenthesis ')'.
 * if(s.charAt(i)=='('){
 * p1++;
 * p2++;
 * } else if(s.charAt(i)==')'){
 * p1--;
 * p2--;
 * } else if(s.charAt(i)=='*'){
 * p1++;
 * p2--;
 * }
 * Checking for Invalid Parentheses:
 * After processing each character, if p1 becomes negative, it means there are
 * more ')' than '(', making the string invalid. Thus, the method returns false.
 * if(p1<0){
 * return false;
 * }
 * If p2 becomes negative, it means that even after considering '' as both '('
 * and ')', there are more ')' than '('. In this case, p2 is reset to 0 since ''
 * can only act as an open parenthesis '(' in this approach.
 * if(p2<0){
 * p2 = 0;
 * }
 * Final Check & Return:
 * After iterating through the string, if p2 is zero, it means there are no
 * leftover open parentheses '(' or '*'. Thus, the string is valid, and the
 * method returns true.
 * The method returns false if there are unbalanced parentheses, otherwise true.
 * return p2==0;
 * This approach efficiently handles the checking of balanced parentheses while
 * considering the wildcard '*' as a placeholder for either '(' or ')'.
 */