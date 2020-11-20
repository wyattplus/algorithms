package leetcode.study;

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


}