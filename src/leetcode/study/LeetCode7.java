package leetcode.study;

public class LeetCode7 {

    //practice-1 需要重新练习
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            result = result * 10 + pop;
            x /= 10;
        }
        return result;
    }
}