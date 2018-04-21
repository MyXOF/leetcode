package cn.edu.myxof.solution4;

public class Solution481 {
	public int magicalString(int n) {
		if (n == 0)
			return 0;
		if (n <= 3)
			return 1;
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 2;
		int tail = 3;
		int p = 2;
		int num = 1;
		int count = 1;
		while (tail < n) {
			if (dp[p] == 1) {
				dp[tail] = num;
				tail++;
			} else {
				dp[tail] = num;
				dp[tail + 1] = num;
				tail += 2;
			}
			if (num == 1) {
				count += dp[p];
			}
			p++;
			num ^= 3;
		}
		return dp[n] == 1 ? count - 1 : count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
