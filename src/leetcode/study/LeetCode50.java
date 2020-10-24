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
}