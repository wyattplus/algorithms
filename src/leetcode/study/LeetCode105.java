package leetcode.study;


import java.util.HashMap;
import java.util.Map;

public class LeetCode105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length) return null;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, inorder, map, 0, preorder.length-1, 0, inorder.length-1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, Map<Integer, Integer> map, int pre_left, int pre_right, int in_left, int in_right) {
        if (pre_left > pre_right || in_left > in_right) return null;
        int root_val = preorder[pre_left];
        TreeNode root = new TreeNode(root_val);
        int pIndex = map.get(root_val);
        root.left = helper(preorder, inorder, map, pre_left + 1, pIndex - in_left + pre_left, in_left, pIndex - 1);
        root.right = helper(preorder, inorder, map, pIndex - in_left + pre_left + 1, pre_right, pIndex + 1, in_right);
        return root;
    }
}