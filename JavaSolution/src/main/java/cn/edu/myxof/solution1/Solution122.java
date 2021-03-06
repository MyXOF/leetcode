package cn.edu.myxof.solution1;

public class Solution122 {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0 || prices.length == 1) {
			return 0;
		}
		int sum = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				sum += prices[i] - prices[i - 1];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
