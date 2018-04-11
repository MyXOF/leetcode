package cn.edu.myxof.solution3;

public class Solution309 {
	/**
	 * buy[i]  = max(rest[i-1]-price, buy[i-1]) 
	 * sell[i] = max(buy[i-1]+price, sell[i-1])
	 * rest[i] = max(sell[i-1], buy[i-1], rest[i-1])
	 * 
	 * rest[i] = sell[i-1]
	 * 
	 * buy[i] = max(sell[i-2]-price, buy[i-1])
	 * sell[i] = max(buy[i-1]+price, sell[i-1])
	 */
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1){
            return 0;
        }
        int preSell = 0, preBuy = Integer.MIN_VALUE, sell = 0, buy = Integer.MIN_VALUE;
        for(int p : prices){
            preBuy = buy;
            buy = Math.max(preSell-p,preBuy);
            preSell = sell;
            sell = Math.max(preBuy+p,preSell);
        }
        return sell;
    }
	public static void main(String[] args) {

	}

}
