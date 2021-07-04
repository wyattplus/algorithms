package leetcode.study;

public class LeetCode977 {
    /**
     * 思路：双指针
     * head tail 移动
     *
     * @param A
     * @return
     */
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        //设定head，tail，current 三个指针
        int head = 0, tail = A.length - 1, current = A.length - 1;
        //头尾移动
        while (head < = tail) {
            //左侧结果>右侧
            if (A[head] * A[head] > A[tail] * A[tail]) {
                result[current] = A[head] * A[head];
                head++;
            }
            //左侧结果<=右侧
            else {
                result[current] = A[tail] * A[tail];
                tail--;
            }
            current--;
        }
        return result;
    }
}