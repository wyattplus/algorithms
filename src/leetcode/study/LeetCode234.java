package leetcode.study;

import java.util.Stack;

public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode temp = head;
        Stack<Integer> stack = new Stack<Integer>();
        int count = 0;
        while (temp != null) {

            stack.push(temp.val);
            temp = temp.next;
            count++;
        }
        count = count >> 1;
        while (count-- >= 0) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }


}
