package leetcode.study;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });

        for (Integer key : map.keySet()) {
            if (queue.size() < k) {
                queue.offer(key);
            } else if (map.get(key) > map.get(queue.peek())) {
                queue.poll();
                queue.offer(key);
            }
        }


        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = queue.poll();
        }
        return result;

    }

    //    practice-2 java stream方式
    public int[] topKFrequent2(int[] nums, int k) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum))
                .entrySet()
                .stream()
                .sorted((m1, m2) -> m2.getValue() - m1.getValue())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();

    }
}