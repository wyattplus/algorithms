package leetcode.test;

public class test1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1,2, 3, 4, 5};
        int a = 0, b = 4;
        while (a < b && nums[a] == nums[++a]) {
            System.out.println(a);
        }
    }
}
