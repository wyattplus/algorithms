package leetcode.study;

public class LeetCode1115 {
    //（ 'a'，'e'，'i'，'o'，'u'）
    public String removeVowels(String S) {
        if (S == null || S.length() == 0) return S;
        StringBuilder result = new StringBuilder();
        char[] cahrs = S.trim().toCharArray();
        for (int i = 0; i < cahrs.length; i++) {
            if (cahrs[i] != 'a' &&
                    cahrs[i] != 'e' &&
                    cahrs[i] != 'i' &&
                    cahrs[i] != 'o' &&
                    cahrs[i] != 'u') result.append(cahrs[i]);

        }
        return result.toString();
    }
}