package leetcode.study;

public class LeetCode557 {

    /**
     * 思路：代码实现和思路都超简单，将字符串按空格分隔成字符串数组，循环每个字符串数组，使用双指针进行数据交换
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            //交换
            char[] chars = strs[i].toCharArray();
            int left = 0, right = chars.length - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            sb.append(chars);
            if (i != strs.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}