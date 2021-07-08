package leetcode.study;

public class LeetCode344 {
    /**
     * 思路：左右指针
     *
     * @param s
     */
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) return;
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}