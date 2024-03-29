package leetcode.study;

public class LeetCode206 {
    //practice1
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode tempNode = null;
        while (cur != null) {
            tempNode = cur.next;
            //确定pre数据
            cur.next = pre;
            pre = cur;
            //jixu
            cur = tempNode;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        node3.next = node4;
        node2.next = node3;
        node1.next = node2;


        new LeetCode206().reverseList(node1);

    }

    public ListNode reverseList2(ListNode head) {
        ListNode slow = null;
        ListNode quick = head;
        while (quick != null) {
            //双指针
            //1。设置临时对象保存下一个链表节点
            ListNode next = quick.next;
            //2。将当前对象指向慢指针
            quick.next = slow;
            //3。慢指针移动一步
            slow = quick;
            //4。快指针移动一步
            quick = next;
        }

        return slow;
    }

    /**
     * 思路：双指针
     * 1。设置1个结果+1个current指针
     * 2。移动current，不断改变next
     * 3。o（n）复杂度
     *
     * @param head
     * @return
     */
    public ListNode reverseList3(ListNode head) {
        ListNode result = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = result;
            result = current;
            current = temp;
        }
        return result;
    }
}