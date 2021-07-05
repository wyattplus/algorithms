package leetcode.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    //practice
    //a + b = -c，夹逼定理

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int x = 0; x < nums.length - 2; x++) {
            if (nums[x] > 0) break;
            if (x > 0 && nums[x] == nums[x - 1]) continue;
            int y = x + 1, z = nums.length - 1;
            while (y < z) {
                int sum = nums[x] + nums[y] + nums[z];
                if (sum < 0) {
                    while (y < z && nums[y] == nums[++y]) ;
                } else if (sum > 0) {
                    while (y < z && nums[z] == nums[--z]) ;
                } else {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[x], nums[y], nums[z])));
                    while (y < z && nums[y] == nums[++y]) ;
                    while (y < z && nums[z] == nums[--z]) ;
                }

            }
        }
        return result;
    }


    /**
     * 思路：利用顺序特性+双指针
     * 1。排序
     * 2。从左到右，a+b+c=0假设
     * 3。b，c设定双指针位置
     * 4。符合的内容加入结果集
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum2(int[] nums) {
        //临界值处理
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) return result;
        //排序.nlog(n)
        Arrays.sort(nums);
        //取-c = a+ b ;假设a的值与位置
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) return result;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int real = nums[left] + nums[right];
                if (real == target) {
                    result.add(new ArrayList<Integer>(
                            Arrays.asList(nums[i], nums[left], nums[right])
                    ));
                    left++;
                    right--;
                    //重复数据不处理
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (right > left && nums[right] == nums[right + 1]) right--;
                } else if (real > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}