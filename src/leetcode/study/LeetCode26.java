package leetcode.study;

public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex]) {
                slowIndex++;
                nums[slowIndex] = nums[fastIndex];
            }
        }
        slowIndex++;
        return slowIndex;
    }

    //practice-2 有序数组！
    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        //设置下标，同时也是最后结果（+1）
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            //判断快慢指针的数据是否相同，不相同则后移。重要是数据是有序的！
            if (nums[i] != nums[index]) {
                //慢指针后移
                index++;
                //数据移动到当前位置
                nums[index] = nums[i];
            }
        }
        //+1
        index++;
        return index;


    }


}