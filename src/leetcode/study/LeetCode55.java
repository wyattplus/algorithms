package leetcode.study;

public class LeetCode55 {
    //贪心
    public boolean canJump(int[] nums) {
        if (nums == null) return false;
        int index = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >= index - i) index = i;

        }
        return index == 0;
    }

}