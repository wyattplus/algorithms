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


    /**
     * 思路：双指针
     * 奇数为指针与偶数位指针组合
     * 步场均=2
     *
     * @param A
     * @return
     */
    public int[] sortArrayByParityII2(int[] A) {
        int fast_index = 1;
        for (int i = 0; i < A.length; i += 2) {
            //当偶数位出现奇数时：移动奇数位指针，一直到奇数=偶数值时
            //交换2位置的值
            if (A[i] % 2 == 1) {
                while (A[fast_index] % 2 == 1) {
                    fast_index += 2;
                }
                //交换数值
                int temp = A[i];
                A[i] = A[fast_index];
                A[fast_index] = temp;
            }

        }
        return A;
    }


}
