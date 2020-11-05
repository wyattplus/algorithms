package leetcode.study;

public class LeetCode152 {
    public int maxProduct(int[] nums) {
        if (nums == null) return 0;
        int res = nums[0], curMax = nums[0], curMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int mx = curMax, mn = curMin;
            curMax = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
            curMin = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
            res = Math.max(curMax, res);
        }
        return res;
    }
}