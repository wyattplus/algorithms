package leetcode.study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int key = 0;
        for (int n : nums
        ) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }

        }
        int mid = nums.length >> 1;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > mid) {
                key = m.getKey();
            }

        }
        return key;
    }

    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }
}