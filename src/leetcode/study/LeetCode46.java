package leetcode.study;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode46 {
    //dfs,回溯法
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque();
        boolean[] used = new boolean[nums.length];
        dfs(nums, 0, stack, used, result);
        return result;

    }

    private void dfs(int[] nums, int level, Deque<Integer> stack, boolean[] used, List<List<Integer>> result) {
//        1.terminator
        if (level == nums.length) {
            result.add(new ArrayList<>(stack));
            return;
        }
//        2.process
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            stack.offerLast(nums[i]);
            used[i] = true;
//        3.drill down
            dfs(nums, level + 1, stack, used, result);
//        4.reverse state
            stack.pollLast();
            used[i] = false;
        }
    }
}