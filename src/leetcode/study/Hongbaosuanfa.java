package leetcode.study;

import java.util.Random;

public class Hongbaosuanfa {

    private int[] hongbao(int total, int num) {
        int[] result = new int[num];
        int count = num - 1;

        //随机切割count次
        for (int i = 0; i < num; i++) {
            result[i] = random(total);

        }

        return result;
    }

    int random(int total) {
        int min = 1;
        int max = total - 1;
        Random random = new Random();
        int s = random.nextInt(max) % (max - min + 1) + min;
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        new Hongbaosuanfa().hongbao(10, 2);
    }
}
