package cn.edu.myxof.solution3;

import java.util.Arrays;

public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        if(amount <= 0) return 0;
        int max = amount +1;
        int[] dp = new int[max];
        Arrays.fill(dp,max);
        dp[0] = 0;
        for(int i = 1; i <= amount;i++){
            for(int c : coins){
                if(c <= i){
                    dp[i] = Math.min(dp[i], dp[i-c]+1);
                }
            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
