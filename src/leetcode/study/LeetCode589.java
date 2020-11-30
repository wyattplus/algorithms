package leetcode.study;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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


    //practice-2 迭代
    public List<Integer> preorder2(Node root) {
        Stack<Node> stack = new Stack<Node>();
        LinkedList<Integer> result = new LinkedList<Integer>();
        if (root == null) return result;
        stack.push(root);
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            result.add(n.val);
            Collections.reverse(n.children);
            for (Node s : n.children) {
                stack.push(s);
            }
        }
        return result;


    }

}

