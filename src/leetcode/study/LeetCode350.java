package leetcode.study;

import java.util.Arrays;


public class LeetCode350 {
    public int[] intersect(int[] nums1, int[] nums2) {


        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length;
        int length2 = nums2.length;
        if (length1 > length2) {
            return intersect(nums2, nums1);
        }
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        int[] result = new int[length1];
        while (index1 < length1 && index2 < length2) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else {
                result[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(result, 0, index);

    }
}