package leetcode.study;

import java.util.*;

public class LeetCode47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0) return result;

        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        Deque<Integer> stack = new ArrayDeque<>();
        dfs(nums, 0, used, stack, result);
        return result;

    }

    private void dfs(int[] nums, int level, boolean[] used, Deque<Integer> stack, List<List<Integer>> result) {
//  terminator
        if (level == nums.length) {
            result.add(new ArrayList<>(stack));
            return;
        }
//process
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            stack.offerLast(nums[i]);
            used[i] = true;
//drill down
            dfs(nums, level + 1, used, stack, result);
//reverse state
            stack.pollLast();
            used[i] = false;

        }

    }
}