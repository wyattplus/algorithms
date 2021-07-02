package leetcode.study;

public class LeetCode_Offer_22 {
    /**
     * 思路：求长度，进行n-k获得位置
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null || k == 0) return null;
        int length = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        int index = length - k;
        /*
        遍历获得
         */
        current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     * 思路：双指针法
     * 快慢指针之间间隔k的距离，当快指针到达链表尾部，则慢指针位置则为结果
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head, fast = head;
        //初始化快慢指针间隔
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}