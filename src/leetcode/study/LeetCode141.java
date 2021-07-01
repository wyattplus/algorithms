package leetcode.study;

public class LeetCode141 {

    //prcatice-1 双指针法
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    //快慢指针思维

    /**
     * 思路：
     * 1。设置快慢指针，slow step=1，fast step=2
     * 2。while中，终止条件：fast=null or next = null
     *
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) return false;
        //启动while条件
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            //terminal
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;

        }
        return true;
    }

    public boolean hasCycle3(ListNode head) {
        //启动while条件
        ListNode slow = head, fast = head;
        do {
            //terminal
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        return true;
    }
}