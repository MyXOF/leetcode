package cn.edu.myxof.solution1;

public class Solution123 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1)
            return 0;
        int buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        int sell1 = 0,sell2 = 0;
        for(int p : prices){
            sell2 = Math.max(sell2, buy2+p);
            buy2 =  Math.max(buy2, sell1-p);
            sell1 = Math.max(sell1, buy1+p);
            buy1 =  Math.max(buy1, -p);
        }
        return sell2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
