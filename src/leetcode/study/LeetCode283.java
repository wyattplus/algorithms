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


}
