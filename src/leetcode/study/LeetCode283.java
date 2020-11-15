package leetcode.study;

import java.util.Arrays;

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

    //practice 2
    public void moveZeroes2(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                //精华所在
                nums[i - zeroCount] = nums[i];
            }
        }
        //末尾zeroCount置0
        Arrays.fill(nums, nums.length - zeroCount, nums.length, 0);
    }

    //practice 3 swap 方法
    public void moveZeroes3(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

}
