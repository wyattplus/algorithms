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

    /**
     * 思路：二维数组连接成一个一维数组，对该数组进行二分查找
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix2(int[][] matrix, int target) {
        int row = matrix.length;
        //参数检查
        if (row == 0) return false;
        int col = matrix[0].length;
        //设置二分法 左右指针
        int left = 0, right = row * col - 1;
        // 迭代遍历，O（n）复杂度即可
        int mid = 0, mid_v = 0;
        while (left <= right) {
            mid = (left + right) >> 1;
            mid_v = matrix[mid / col][mid % col];
            if (mid_v == target) return true;
            if (mid_v > target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }

        }
        return false;
    }

}