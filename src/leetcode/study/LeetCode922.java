package leetcode.study;


public class LeetCode922 {

    public int[] sortArrayByParityII(int[] A) {
        int oddIndex = 1;
        for (int evenIndex = 0; evenIndex < A.length; evenIndex += 2) {
            if ((A[evenIndex] & 1) == 1) {
                while ((A[oddIndex] & 1) == 1) {
                    oddIndex += 2;
                }
                int temp = A[evenIndex];
                A[evenIndex] = A[oddIndex];
                A[oddIndex] = temp;
            }
        }
        return A;
    }


}
