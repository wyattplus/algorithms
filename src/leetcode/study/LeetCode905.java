package leetcode.study;

public class LeetCode905 {

    /**
     * 思路：快排思想，头尾指针移动
     * 优化：
     *
     * @param nums
     * @return
     */
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            /**
             *位运算 可以优化
             */
            //左边为奇数，右边为偶数。需要交换
            if ((nums[left] % 2) > (nums[right] % 2)) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if (nums[left] % 2 == 0) left++;
            if (nums[left] % 2 == 1) right--;
        }
        return nums;
    }


}

