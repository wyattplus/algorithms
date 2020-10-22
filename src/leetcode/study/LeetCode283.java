package leetcode.study;

public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                if (i != index) {
                    nums[i] = 0;
                }
                index++;
            }

        }

    }

    public static void main(String[] args) {
        new LeetCode283().moveZeroes(new int[]{2,0,4,5});
    }


}
