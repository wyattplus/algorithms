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

    public boolean isValid2(String s) {

        int length;
        do {
            length = s.length();
            s = s.replace("[]", "").replace("{}", "").replace("()", "");
        } while (length != s.length());
        return s.length() == 0;
    }


    //practice2      stack
    private boolean isValid3(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }

        }
        return stack.isEmpty();
    }

    public boolean isValid4(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid5(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }

        }
        return stack.isEmpty();
    }
}