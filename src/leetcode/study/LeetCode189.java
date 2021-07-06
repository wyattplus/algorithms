package leetcode.study;

import java.util.Arrays;

public class LeetCode189 {
    //prcatice-1 反转思想
    public void rotate(int[] nums, int k) {

        //取余，很重要
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    //反转list
    private void reverse(int[] nums, int k, int i) {
        while (k < i) {
            int temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
            k++;
            i--;
        }
    }

    /**
     * 思路：额外空间存储
     * 1。初始化额外数组
     * 2。取余进行下标对应
     * 3。放回原数组
     *
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }
        //放回原数组
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];

        }
    }

    /**
     * 思路：翻转数组，然后取段落
     * 1。整体翻转
     * 2。0-（k-1）翻转
     * 3。（k-1）-（n-1）翻转
     *
     * @param nums
     * @param k
     */
    public void rotate3(int[] nums, int k) {
        k = k % nums.length;
        //翻转可以抽象成函数
        //整体翻转
        reverse(nums, 0, nums.length - 1);
        //头部翻转
        reverse(nums, 0, k - 1);
        //尾部翻转
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}