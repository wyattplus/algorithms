package leetcode.study;

public class LeetCode16 {

    /**
     * 思路：双指针
     * 特点：1。顺序数组，2。下标
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int result = numbers[left] + numbers[right];
            if (result == target) {
                return new int[]{left + 1, right + 1};
            } else if (result < target) {
                left++;
            } else {
                right--;
            }

        }
        return new int[]{-1, -1};
    }
}