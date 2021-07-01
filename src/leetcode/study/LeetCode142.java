package leetcode.study;

public class LeetCode142 {

    //prcatice-1  数学公式推导 f = a + nb
    // 方法很绝！
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    /**
     * 思路：数学公式推导
     * 1。第一相遇，f=s+nb
     * 2。设置第二次相遇，f指针回头部，重遇时为入口点。
     *
     * @param head
     * @return
     */
    public ListNode detectCycle2(ListNode head) {
        ListNode fast = head, slow = head;
        do {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            //第一次相遇
            if (fast == slow) break;
        } while (true);
        //构建第二次相遇
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        //第二次交汇点
        return fast;
    }
}