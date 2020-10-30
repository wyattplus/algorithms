package leetcode.study;

import java.util.List;

public class LeetCode120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> list = triangle.get(triangle.size() - 1);

        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                list.set(j, triangle.get(i).get(j) + Math.min(list.get(j), list.get(j + 1)));
            }
        }
        return list.get(0);
    }
}




