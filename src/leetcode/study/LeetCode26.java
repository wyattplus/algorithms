package leetcode.study;

public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex]) {
                slowIndex++;
                nums[slowIndex] = nums[fastIndex];
            }
        }
        slowIndex++;
        return slowIndex;
    }

    public static void main(String[] args) {
        new LeetCode26().removeDuplicates(new int[]{2, 2, 3, 0, 2, 1});
    }
}