package leetcode.study;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {
    List<String> result;

    public List<String> generateParenthesis(int n) {
        result = new ArrayList<String>();
        generate(0, 0, n, "");
        return result;

    }

    void generate(int left, int right, int n, String s) {
        //terminator
        if (left == n && right == n) {
            System.out.println(s);
            result.add(s);

            return;
        }
        //process
        //drill down
        if (left < n) {
            generate(left + 1, right, n, s + "(");
        }
        if (right < left) {
            generate(left, right + 1, n, s + ")");
        }


        //reserve
    }

    //    practice-2 减法递归
    public List<String> generateParenthesis2(int n) {
        result = new ArrayList<String>();
        generate2(n, n, n, "");
        return result;
    }

    void generate2(int left_remain, int right_remain, int n, String s) {
        //terminator
        if (left_remain == 0 && right_remain == 0) {
            result.add(s);
        }
        //process & recursion
        if (left_remain != 0) generate2(left_remain - 1, right_remain, n, s + "(");

        if (right_remain != 0 && right_remain > left_remain) generate2(left_remain, right_remain - 1, n, s + ")");

        //no reset
    }
}

