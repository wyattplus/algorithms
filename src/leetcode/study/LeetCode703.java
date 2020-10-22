package leetcode.study;

import java.util.PriorityQueue;

public class LeetCode703 {

    final private PriorityQueue<Integer> queue;
    final int k;

    public LeetCode703(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<Integer>(k);
        for (int n : nums
        ) {
            add(n);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else if (queue.peek() < val) {
            queue.poll();
            queue.offer(val);

        }
        return queue.peek();

    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int[]{4, 5, 8, 2};
        LeetCode703 kthLargest = new LeetCode703(3, arr);
        kthLargest.add(3);// returns 4
        kthLargest.add(5);// returns 5
        kthLargest.add(10); // returns 5
        kthLargest.add(9); // returns 8
        kthLargest.add(4); // returns 8
        System.out.println(kthLargest);
    }
}