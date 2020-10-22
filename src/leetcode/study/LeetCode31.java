package leetcode.study;

public class LeetCode31 {

    public void nextPermutation(int[] nums) {
        //1.从后向前查看逆序区域，找到逆序区域的前一位，也就是数字置换的边界
        int index = findTransferPoint(nums);


        if (index != 0) {
            //2.把逆序区域的前一位和逆序区域中刚刚大于它的数字交换位置
            //复制并入参，避免直接修改入参

            exchangeHead(nums, index);
            //3.把原来的逆序区域转为顺序
            reverse(nums, index);
        } else {
            //如果数字置换边界是0，说明整个数组已经逆序，无法得到更大的相同数字组成的整数,反转即可


            for (int i = 0; i <= nums.length / 2 - 1; i++) {
                int temp1 = nums[i];
                int temp2 = nums[nums.length - i - 1];
                nums[i] = temp2;
                nums[nums.length - i - 1] = temp1;
            }

        }

    }

    private static int findTransferPoint(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] > numbers[i - 1]) {
                return i;
            }
        }
        return 0;
    }

    private static int[] exchangeHead(int[] numbers, int index) {
        int head = numbers[index - 1];
        for (int i = numbers.length - 1; i > 0; i--) {
            if (head < numbers[i]) {
                numbers[index - 1] = numbers[i];
                numbers[i] = head;
                break;
            }
        }
        return numbers;
    }

    private static int[] reverse(int[] num, int index) {
        for (int i = index, j = num.length - 1; i < j; i++, j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
        return num;
    }


    //输出数组
    private static void outputNumbers(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i);
        }
        System.out.println();
    }

}

