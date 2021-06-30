package leetcode.study;

import java.util.HashMap;

// 计数法
// ascii码值法
// 异或方法
public class LeetCode389 {
    public char findTheDifference(String s, String t) {
        //思路：计数法
        // 利用hashmap的O（1）特性，将字符串s存入map，计算值+1，再将t遍历，计算值-1，目标找到结果为-1那个
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Character ch2 : t.toCharArray()) {
            map.put(ch2, map.getOrDefault(ch2, 0) - 1);
            if (map.get(ch2) < 0) {
                return ch2;
            }
        }
        return ' ';
    }

    //求和方法
    public char findTheDifference2(String s, String t) {
        /**
         * s与t进行ascii值求和，差值则为最终目标。（此题不需要index，所以此方法非常高效）
         */
        int result = 0;
        for (int i = 0; i < t.length(); i++) {
            result = result + t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            result = result - s.charAt(i);
        }

        return (char) result;
    }

    public char findTheDifference3(String s, String t) {
        int result = 0;
        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }

        return (char) result;
    }
}