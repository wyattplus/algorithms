package leetcode.study;

public class LeetCode200 {
    public int numIslands(char[][] grid) {
        int islandNum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    ranse(grid, i, j);
                    islandNum++;
                }
            }
        }
        return islandNum;
    }
    public void ranse(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length ||
                j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '2';
        ranse(grid, i + 1, j);
        ranse(grid, i - 1, j);
        ranse(grid, i, j + 1);
        ranse(grid, i, j - 1);
    }
}
