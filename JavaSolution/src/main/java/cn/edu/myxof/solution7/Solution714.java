package cn.edu.myxof.solution7;

public class Solution714 {
    public int maxProfit(int[] prices, int fee) {
        if(prices == null || prices.length == 1){
            return 0;
        }
        int buy = -prices[0], sell = 0;
        int len = prices.length;
        for(int i = 1; i < len;i++){
            int tmp = sell;
            sell = Math.max(buy+prices[i]-fee, sell);
            buy = Math.max(tmp-prices[i], buy);
        }
        return sell;
    }
}
