package leetcode.study;

import java.util.HashMap;
import java.util.Stack;

public class LeetCode20 {
    public boolean isValid(String s) {
        if (s == null || s.toCharArray().length == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        for (Character x : s.toCharArray()) {
            if (!map.containsKey(x)) {
                stack.push(x);
            } else {

                if (stack.isEmpty() || map.get(x) != stack.pop()) {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }

    static boolean isValid2(String s) {

        int length;
        do {
            length = s.length();
            s = s.replace("[]", "").replace("{}", "").replace("()", "");
        } while (length != s.length());
        return s.length() == 0;
    }


}