package leetcode.study;

import java.util.Stack;

public class LeetCode155 {
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    public LeetCode155() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        }
    }

    public void pop() {

        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}