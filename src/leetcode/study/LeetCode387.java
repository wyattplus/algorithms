package leetcode.study;

public class LeetCode387 {
    public int firstUniqChar(String s) {
        //数组效率
        int[] nums = new int[26];
        int lenth = s.length();
        //入数组统计频率
        for (int i = 0; i < lenth; i++) {
            nums[s.charAt(i) - 'a']++;
        }
        //        遍历频率第一个value=1
        for (int i = 0; i < lenth; i++) {
            if (nums[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}