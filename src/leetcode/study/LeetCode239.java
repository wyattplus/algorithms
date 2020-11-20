package leetcode.study;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LeetCode239 {


    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) return nums;
//        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        LinkedList<Integer> queue = new LinkedList();
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            queue.addLast(i);
            if (queue.peek() <= i - k) {
                queue.poll();
            }
            if (i + 1 >= k) {
                result[i + 1 - k] = nums[queue.peek()];
            }
        }
        return result;

    }

    //practice-2 deque peek保留最大值
    public int[] maxSlidingWindow2(int[] nums, int k) {
        //条件判断
        if (nums == null || nums.length < 2) return nums;
        Deque<Integer> deque = new ArrayDeque<Integer>();
        //初始化一个结果数组
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            // 保证从大到小 如果前面数小则需要依次弹出，直至满足要求
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            //deque 保留的nums下标
            deque.addLast(i);
            //判断当前队列中队首的值是否有效
            if (deque.peek() <= i - k) {
                deque.poll();
            }
            //从K-1 下表开始保存结果
            if (i + 1 >= k) {
                result[i + 1 - k] = nums[deque.peek()];
            }

        }
        return result;
    }
}