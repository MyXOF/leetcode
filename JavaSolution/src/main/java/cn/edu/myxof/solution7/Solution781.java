package cn.edu.myxof.solution7;

public class Solution781 {
	public int numRabbits(int[] answers) {
		int[] dp = new int[1000];
		for (int a : answers) {
			dp[a]++;
		}
		int count = dp[0];
		for (int i = 1; i <= 999; i++) {
			if (dp[i] == 0)
				continue;
			count += (i + 1) * (dp[i] / (i + 1));
			if (dp[i] % (i + 1) != 0) {
				count += (i + 1);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
