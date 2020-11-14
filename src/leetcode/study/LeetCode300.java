package leetcode.study;

public class LeetCode300 {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int result = 1;
        int[] dp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) dp[i] = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}