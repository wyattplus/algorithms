package leetcode.study;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode84 {

    //prcatice-1 模仿，stack
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);

        Stack<Integer> minStack = new Stack<Integer>();

        for (int i = 0; i < n; ++i) {
            while (!minStack.isEmpty() && heights[minStack.peek()] >= heights[i]) {
                right[minStack.peek()] = i;
                minStack.pop();
            }
            left[i] = (minStack.isEmpty() ? -1 : minStack.peek());
            minStack.push(i);
        }
        int result = 0;
        for (int i = 0; i < n; ++i) {
            result = Math.max(result, (right[i] - left[i] - 1) * heights[i]);
        }
        return result;
    }


}
