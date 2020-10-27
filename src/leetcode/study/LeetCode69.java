package leetcode.study;

public class LeetCode69 {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 0, right = x, result = 0;
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


}