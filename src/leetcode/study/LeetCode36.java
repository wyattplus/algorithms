package leetcode.study;

import java.util.HashMap;

public class LeetCode36 {

    public boolean isValidSudoku(char[][] board) {
        // init
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] columns = new HashMap[9];
        HashMap<Integer, Integer>[] blocks = new HashMap[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<Integer, Integer>();
            columns[i] = new HashMap<Integer, Integer>();
            blocks[i] = new HashMap<Integer, Integer>();
        }

        //  遍历整个数独
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int n = (int) c;
                    // 可以使用 block_index = (row / 3) * 3 + columns / 3，其中 / 是整数除法。
                    int block_index = (i / 3) * 3 + j / 3;
                    // 将放入每个row  column block
                    rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                    columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
                    blocks[block_index].put(n, blocks[block_index].getOrDefault(n, 0) + 1);
                    //判断是否存在于rows，columns，block
                    if (rows[i].get(n) > 1 || columns[j].get(n) > 1 || blocks[block_index].get(n) > 1)
                        return false;


                }
            }
        }
        return true;
    }


}