package leetcode.study;

public class LeetCode74 {
    //二分查找法
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_num = matrix.length;
        if (row_num == 0) return false;
        int col_num = matrix[0].length;
        int left = 0, right = row_num * col_num - 1;
        int mid_index, mid_value;
        while (left <= right) {
            mid_index = (left + right) >> 1;
            mid_value = matrix[mid_index / col_num][mid_index % col_num];
            if (target == mid_value) {
                return true;
            } else if (target < mid_value) {
                right = mid_index - 1;
            } else {
                left = mid_index + 1;
            }
        }
        return false;
    }
}