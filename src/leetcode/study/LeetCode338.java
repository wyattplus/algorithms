package leetcode.study;

import java.util.Arrays;

public class LeetCode338 {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        Arrays.fill(result, 0);
        for (int i = 1; i <= num; i++) {
            result[i] = result[i & (i - 1)] + 1;
        }
        return result;
    }
}