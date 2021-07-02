package leetcode.study;

public class LeetCode61 {

    /**
     * 思路：形成环，取模运算
     * 1。计算链表长度
     * 2。取模确定最终位置点
     * 3。形成环
     * 4。截取
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int num = 1;
        ListNode temp = head;
        /*
        统计链表长度
         */
        while (temp.next != null) {
            temp = temp.next;
            num++;
        }
        /*
        通过取模，确定下标
         */
        int add = num - k % num;
        if (add == num) {
            return head;
        }
        temp.next = head;
        /**
         * 形成环状链表
         */
        while (add-- > 0) {
            temp = temp.next;
        }

        ListNode result = temp.next;
        /*
        断开环
         */
        temp.next = null;
        return result;

    }
}