package leetcode.study;

import java.util.LinkedList;
import java.util.List;

public class LeetCode589 {


    private List<Integer> res = new LinkedList<Integer>();

    public List<Integer> preorder(Node root) {
        dfs(root);
        return res;
    }

    private void dfs(Node root) {
        if (root == null) return;
        res.add(root.val);
        for (Node child : root.children)
            dfs(child);
    }


}


class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};