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
}