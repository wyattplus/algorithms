package leetcode.study;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
    /**
     * 思路：滑动窗口
     * 1。设定最左节点
     * 2。map存放key=字符，value=下标
     * 3。对比已存在的字符，如果存在，则max高位值
     * 4。放入map
     * 5。记录最大长度
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;

    }
}
