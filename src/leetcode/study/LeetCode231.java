package leetcode.study;

public class LeetCode231 {
    public boolean isPowerOfTwo(int n) {

        return n > 0 && (n & (n - 1)) == 0 ? true : false;
    }

    //    practice-2
    public boolean isPowerOfTwo2(int n) {
        if (n <= 0) {
            return false;
        }
        int result = n & (n - 1);
        return result == 0;
    }

}
