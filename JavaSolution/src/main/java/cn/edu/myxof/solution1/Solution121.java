package cn.edu.myxof.solution1;

public class Solution121 {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0 || prices.length == 1)
			return 0;
		int profit = 0;
		int buy = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] - buy > profit) {
				profit = prices[i] - buy;
			} else if (prices[i] < buy) {
				buy = prices[i];
			}

		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] test = { 7, 1, 5, 3, 6, 4 };
	}

}
