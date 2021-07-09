package leetcode.study;

public class LeetCode19 {
    /**
     * 思路:快慢指针，步长均为1。间隔n个元素
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode slow = dummyNode, fast = head;
        //移动fast，使fast 快于 slow n步
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        //整体移动
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //slow.next 则为正确值
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}