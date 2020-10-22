package leetcode.study;

import java.util.Stack;

public class LeetCode232 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public LeetCode232() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return 0;
            }
            transfer();
        }
        System.out.println(stack2);
        return stack2.pop();


    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return 0;
            }
            transfer();
        }
        int resp = stack2.pop();
        stack2.push(resp);
        return resp;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void transfer() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public static void main(String[] args) {


        LeetCode232 obj = new LeetCode232();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}

