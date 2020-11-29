package leetcode.study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {

    private List<Integer> result = new LinkedList<Integer>();

    //practice-1 递归
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result;
        helper(root);
        return result;
    }

    public void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        result.add(root.val);
        helper(root.right);
    }

    //practice-2 迭代
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return result;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}

