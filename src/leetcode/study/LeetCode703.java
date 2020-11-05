package leetcode.study;

import java.util.PriorityQueue;

public class LeetCode703 {

    private PriorityQueue<Integer> queue;
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


}