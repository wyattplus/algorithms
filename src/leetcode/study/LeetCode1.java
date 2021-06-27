package leetcode.study;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x).intValue(), i};
            } else {
                map.put(nums[i], i);
            }

        }
        return new int[0];
    }

    //practice-2
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{i, map.get(x).intValue()};
            } else {
                map.put(nums[i], i);
            }


        }
        return new int[0];
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>(nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            int oth = target - nums[i];
            if (dict.containsKey(oth)) {
                return new int[]{dict.get(oth), i};
            } else {
                dict.put(nums[i], i);
            }
        }
        return new int[]{};
    }

}