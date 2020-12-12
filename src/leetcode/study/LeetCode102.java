package leetcode.study;


import java.util.*;

public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int tempSize = queue.size();
            for (int i = 0; i < tempSize; i++) {
                TreeNode tn = queue.poll();
                list.add(tn.val);
                if (tn.left != null) queue.offer(tn.left);
                if (tn.right != null) queue.offer(tn.right);
            }
            result.add(list);
        }
        return result;
    }

    //practice-2 bfs
    public List<List<Integer>> levelOrder2(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) return result;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offerLast(root);
        while (!queue.isEmpty()) {
            //当前层的结果
            List<Integer> row = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pollFirst();
                row.add(node.val);
                if (node.left != null) queue.offerLast(node.left);
                if (node.right != null) queue.offerLast(node.right);
            }
            result.add(row);
        }

        return result;
    }

}


