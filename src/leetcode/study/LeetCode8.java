package leetcode.study;

public class LeetCode8 {
    /**
     * 思路：细节思考要全面
     * 1。去除空字符串
     * 2。处理正负号
     * 3。字符串转数值累计
     * 4。处理值溢出
     * 5。汇总
     *
     * @param s
     * @return
     */
    public int myAtoi(String s) {
        //1。去除空字符
        s = s.trim();
        if (s.length() == 0) return 0;
        //2。确定正负号
        int sign = 1;
        int index = 0;
        //记录结果与上次值
        int result = 0, pre = 0;
        char ch = s.charAt(0);
        if (ch == '-') {
            sign = -1;
            index++;
        }
        if (ch == '+') {
            index++;
        }
        //3。迭代
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c < '0' || c > '9') break;
            //判断Integer 上下界限
            pre = result;
            result = result * 10 + (c - '0');
            //如果不相等就是超过边界
            if (pre != result / 10)
                return (sign == (-1)) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            index++;
        }
        //4。正负值
        return sign * result;
    }
}