package leetcode.study;


public class LeetCode191 {

    public int hammingWeight(int n) {

        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    //practice-2
    public int hammingWeight2(int n) {

        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}


