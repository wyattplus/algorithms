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
        //teminator
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

    public static void main(String[] args) {
        System.out.println(new LeetCode22().generateParenthesis(3));
    }
}

