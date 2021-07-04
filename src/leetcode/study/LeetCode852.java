package leetcode.study;

public class LeetCode852 {

    /**
     * 思路：遍历法。检索到arr[i]>arr[i+1]则为结果
     *
     * @param arr
     * @return
     */
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }

        }
        return -1;
    }

    /**
     * 思路：二分法（双指针）
     * 左右指针移动。峰顶左侧需要增量，右侧是下降
     *
     * @param arr
     * @return
     */
    public int peakIndexInMountainArray2(int[] arr) {
        int left = 1, right = arr.length - 2, result = 0;
        while (left < right) {
            int mid = (left + right) >> 1;
            //左侧符合
            if (arr[mid] > arr[mid - 1]) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }

        }
        return result;
    }
}

