package leetcode.study;

import java.util.*;

public class LeetCode49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List> result = new HashMap<String, List>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList());
            }
            result.get(key).add(str);
        }
        return new ArrayList(result.values());
    }
}


