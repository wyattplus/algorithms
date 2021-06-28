package leetcode.study;

import java.util.Stack;

public class LeetCode0 {

    public String decodeString(String s) {

        Stack<StringBuffer> strs = new Stack<StringBuffer>();
        Stack<Integer> nums = new Stack<Integer>();
        int multi = 0;
        StringBuffer ans = new StringBuffer();
        //数字存放在数字栈，字符串存放在字符串栈，遇到右括号时候弹出一个数字栈，字母栈弹到左括号为止。就是逆波兰式那种题。
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) multi = multi * 10 + c - '0';
            else if (c == '[') {
                strs.add(ans);
                nums.add(multi);
                ans = new StringBuffer();
                multi = 0;
            } else if (Character.isAlphabetic(c)) {
                ans.append(c);
            } else {
                StringBuffer temp = strs.pop();
                Integer tmp = nums.pop();
                for (int i = 0; i < tmp; i++) temp.append(ans);
                ans = temp;
            }
        }
        return ans.toString();
    }
}