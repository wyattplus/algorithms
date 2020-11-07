package leetcode.study;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int result = 0;
        int[][] profit = new int[prices.length][3];
        //二维状态：0-未持有，1-买入但未卖出，2-卖出
        profit[0][0] = 0;
        profit[0][1] = -prices[0];
        profit[0][2] = 0;
        for (int i = 1; i < prices.length; i++) {
            profit[i][0] = profit[i - 1][0];
            profit[i][1] = Math.max(profit[i - 1][1], profit[i - 1][0] - prices[i]);
            profit[i][2] = profit[i - 1][1] + prices[i];
            result = Math.max(Math.max(result, profit[i][0]), Math.max(profit[i][1], profit[i][2]));
        }
        return result;
    }
}




