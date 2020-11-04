package leetcode.study;

public class LeetCode125 {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "");
        String str2 = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(str2);
    }
}