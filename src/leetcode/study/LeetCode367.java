package leetcode.study;

public class LeetCode367 {
    public boolean isPerfectSquare(int num) {
        long c = num;
        while (c * c > num) {
            c = (c + num / c) / 2;
        }
        return (c * c) == num;
    }
}