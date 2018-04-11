package cn.edu.myxof.solution1;

public class Solution188 {
    public int maxProfit(int k, int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1 || k <= 0)
            return 0;
        int len = prices.length;
        if(k >= len / 2) return quickSolve(prices, len);
        int[][] dp = new int[k][2];
        for(int i = 0; i < k;i++){
            dp[i][0] = 0;
            dp[i][1] = Integer.MIN_VALUE;
        }
        for(int p : prices){
            for(int i = k-1;i > 0;i--){
                dp[i][0] = Math.max(dp[i][1]+p,dp[i][0]);
                dp[i][1] = Math.max(dp[i-1][0]-p,dp[i][1]);
            }
            dp[0][0] = Math.max(dp[0][1]+p,dp[0][0]);
            dp[0][1] = Math.max(-p,dp[0][1]);
        }
        
        return dp[k-1][0];
    }
    
    private int quickSolve(int[] prices, int len) {
        int profit = 0;
        for (int i = 1; i < len; i++)
            if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
        return profit;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
