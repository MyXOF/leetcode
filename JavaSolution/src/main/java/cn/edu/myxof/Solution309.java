package cn.edu.myxof;

public class Solution309 {
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
