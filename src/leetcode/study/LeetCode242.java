package leetcode.study;

import java.util.HashMap;
import java.util.Map;

public class LeetCode242 {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {
        };
        Map<Character, Integer> map2 = new HashMap<Character, Integer>() {
        };
        for (Character x :
                s.toCharArray()) {
            Integer value = map.get(x);
            if (value == null) {
                map.put(x, 1);
            } else {
                map.put(x, value + 1);
            }
        }
        for (Character y :
                t.toCharArray()) {
            Integer value = map2.get(y);
            if (value == null) {
                map2.put(y, 1);
            } else {
                map2.put(y, value + 1);
            }
        }

        return map2.equals(map);
    }

    //practice-2 hash值判断
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] index = new int[26];
        for (int i = 0; i < s.length(); i++) {
            index[s.charAt(i) - 'a']++;
            index[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (index[i] != 0) return false;
        }
        return true;

    }

}