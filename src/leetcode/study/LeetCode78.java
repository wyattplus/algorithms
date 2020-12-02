package leetcode.study;

import java.util.ArrayList;
import java.util.List;

public class LeetCode78 {
//    practice-1 分治
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null) return result;
        helper(result, nums, new ArrayList<Integer>(), 0);
        return result;
    }

    private void helper(List<List<Integer>> result, int[] nums, ArrayList<Integer> list, int i) {
//        terminator
        if (i == nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
//        process

//        drill down
//        不选择
        helper(result, nums, list, i + 1);
//选择
        list.add(nums[i]);
        helper(result, nums, list, i + 1);
//        reverse state
        list.remove(list.size() - 1);
    }
}