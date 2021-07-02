package leetcode.study;

public class LeetCode92 {
    /**
     * 思路：头插法
     * 1。设置2个虚拟点
     * 2。移动第二个点进行头部插入
     * 1、我们定义两个指针，分别称之为 g(guard 守卫) 和 p(point)。
     * 我们首先根据方法的参数 m 确定 g 和 p 的位置。将 g 移动到第一个要反转的节点的前面，将 p 移动到第一个要反转的节点的位置上。我们以 m=2，n=4为例。
     * 2、将 p 后面的元素删除，然后添加到 g 的后面。也即头插法。
     * 3、根据 m 和 n 重复步骤（2）
     * 4、返回 dummyHead.next
     *
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode g = dummyNode;
        ListNode p = dummyNode.next;
        for (int i = 0; i < left - 1; i++) {
            g = g.next;
            p = p.next;
        }

        //头部插入
        for (int i = 0; i < right - left; i++) {
            ListNode removed = p.next;
            p.next = p.next.next;
            removed.next = g.next;
            g.next = removed;

        }
        return dummyNode.next;
    }
}