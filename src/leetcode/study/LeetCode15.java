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
}