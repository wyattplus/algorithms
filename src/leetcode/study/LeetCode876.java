package leetcode.study;

public class LeetCode876 {

    /**
     * 思路：快慢指针
     * fast = 2 slow
     *
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}