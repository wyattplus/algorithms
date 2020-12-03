package leetcode.study;

public class LeetCode50 {
    public double myPow(double x, int n) {

        if (n == 0) return 1.0;
        if (x == 0) return 0.0;
        long b = n;
        double result = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1) result *= x;
            x *= x;
            b >>= 1;
        }
        return result;

    }

    //practice-2 递归分治
    public double myPow2(double x, int n) {
        //    处理N<0
        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        return helper(x, n);
    }

    private double helper(double x, long b) {
        if (b == 0) return 1d;
        double half = helper(x, b / 2);
        return (b & 1) == 0 ? half * half : half * half * x;

    }


}