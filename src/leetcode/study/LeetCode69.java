package leetcode.study;

public class LeetCode69 {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 1, right = x, result = 0;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
                result = mid;
            }
        }
        return result;

    }

    //注practice-2 注意long 类型
    public int mySqrt2(int x) {
        if (x == 0 || x == 1) return x;
        long left = 1, right = x, result = 0;
        while (left <= right) {
            long mid = (left + right) >> 1;
            if (mid == x / mid) {
                return (int) mid;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
                result = mid;
            }
        }
        return (int) result;

    }

    //practice-3 牛顿迭代法
    public int mySqrt3(int x) {
        long c = x;
        while (c * c > x) {
            c = (c + x / c) / 2;
        }
        return (int) c;
    }


}