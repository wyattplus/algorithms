package leetcode.study;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        dfs(n, k, 1, stack, result);
        return result;
    }

    private void dfs(int n, int k, int start, Deque<Integer> stack, List<List<Integer>> result) {
//terminator
        if (k == 0) {
            result.add(new ArrayList<>(stack));
            return;
        }
//        process
        for (int i = start; i <= n - k + 1; i++) {
            stack.offerLast(i);
            //        drill down
            dfs(n, k - 1, i + 1, stack, result);
            //        reverse state
            stack.removeLast();
        }
    }
}