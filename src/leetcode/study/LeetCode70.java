package leetcode.study;

public class LeetCode70 {
    public int climbStairs(int n) {
        int n1 = 1, n2 = 1;
        for (int i = 1; i < n; i++) {
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
        return n2;
    }

    public int climbStairs2(int n) {
        if (n <= 2) return n;
        int result = 0;
        int first = 2;
        int second = 1;
        for (int i = 2; i < n; i++) {
            result = first + second;
            second = first;
            first = result;
        }
        return result;
    }

    //practice 2
    public int climbStairs3(int n) {
        if (n <= 2) return n;
        int f1 = 1, f2 = 2, f3 = 0;
        for (int i = 2; i < n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

        }
        return f3;
    }

    //practice 4
    public int climbStairs4(int n) {
        if (n <= 2) return n;
        int a = 0, b = 1, c = 2;
        for (int i = 2; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}