package leetcode.study;

import java.util.HashMap;
import java.util.Map;

public class LeetCode290 {
    /**
     * 判断字符与字符串之间是否恰好一一对应。即任意一个字符都对应着唯一的字符串，任意一个字符串也只被唯一的一个字符对应。
     * 在集合论中，这种关系被称为「双射」。
     *
     * @param pattern
     * @param s
     * @return
     */
    public boolean wordPattern(String pattern, String s) {
        /**
         * 1.切割字符串s
         * 2.使用hashmap存储kv关系，k为pattern字符，v为对应的s值
         * 3.- 如果map中之前没加入过pattern[i]这个key：
         *          如果map中还没有pattern[i]这个key，但是已经有了arr[i]这个value，说明arr[i]这个value不止和当前的key对应，它曾经也和别的key对应过，不符合题目中要求的双向连接的规律，返回false。
         *          否则，把pattern[i]和arr[i]这二者的对应关系加入map
         *   - 如果map之前曾加入过pattern[i]这个key，那么只需要检查这个key对应的value是否是str[i]即可。
         */
        String[] strs = s.split(" ");
        if (strs.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(strs[i])) return false;
                map.put(pattern.charAt(i), strs[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(strs[i])) return false;
            }

        }
        return true;
    }

    /**
     * 利用map返回上一次value（index）的特性，拆分为最小子问题
     * @param pattern
     * @param s
     * @return
     */
    public boolean wordPattern2(String pattern, String s) {
        /**
         * 1.切割字符串s
         * 2.使用hashmap存储kv关系，k为object，v为对应的index
         * 3.迭代pattern，判断map.put的返回值
         * 4.比较put返回值
         */
        String[] strs = s.split(" ");
        if (strs.length != pattern.length()) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (Integer i = 0; i < strs.length; i++) {
            /*参考：
                如果key不存在，插入成功，返回null；如果key存在，返回之前对应的value。

                以pattern = "abba", str = "dog cat cat dog"为例，
                第1次：map.put('a',0)返回null，map.put("dog",0)返回null，两者相等；
                第2次：map.put('b',1)返回null，map.put("cat",1)返回null，两者相等；
                第3次：map.put('b',2)返回1，map.put("cat",2)返回1，两者相等；
                第4次：map.put('a',3)返回0，map.put("dog",3)返回0，两者相等，
                结果为 true。

                以pattern = "abba", str = "dog cat cat fish"为例，
                第1次：map.put('a',0)返回null，map.put("dog",0)返回null，两者相等；
                第2次：map.put('b',1)返回null，map.put("cat",1)返回null，两者相等；
                第3次：map.put('b',2)返回1，map.put("cat",2)返回1，两者相等；
                第4次：map.put('a',3)返回0，map.put("fish",3)返回null，两者不相等，
                结果为 false。
            */
            if (map.put(pattern.charAt(i), i) != map.put(strs[i], i)) {
                return false;
            }
        }
        return true;
    }
}