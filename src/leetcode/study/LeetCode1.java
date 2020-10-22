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
}