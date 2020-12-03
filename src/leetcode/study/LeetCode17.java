package leetcode.study;

import java.util.*;

public class LeetCode17 {
    Map<Character, String> map;

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result = new LinkedList<>();
        helper("", digits, 0, result, map);
        return result;
    }

    private void helper(String s, String digits, int level, List<String> result, Map<Character, String> map) {
//        terminator
        if (level == digits.length()) {
            result.add(s);
            return;
        }
//        process
        String str = map.get(digits.charAt(level));
        for (int i = 0; i < str.length(); i++) {
//        drill down
            helper(s + str.charAt(i), digits, level + 1, result, map);
        }

//        reverse state
    }
}