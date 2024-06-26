class Solution {
    public int fib(int n) {
        int a = 0, b = 1, c = 0;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}

// https://leetcode.com/problems/fibonacci-number/