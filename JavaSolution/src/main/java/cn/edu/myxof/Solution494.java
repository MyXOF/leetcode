package cn.edu.myxof;

public class Solution494 {
	public int findTargetSumWays(int[] nums, int S) {
		if (nums == null || nums.length == 0 || S > 1000) {
			return 0;
		}
		int[] dp = new int[2001];
		dp[nums[0] + 1000] = 1;
		dp[-nums[0] + 1000] += 1;
		for (int i = 1; i < nums.length; i++) {
			int[] next = new int[2001];
			for (int sum = -1000; sum <= 1000; sum++) {
				if (dp[sum + 1000] > 0) {
					next[nums[i] + sum + 1000] += dp[sum + 1000];
					next[-nums[i] + sum + 1000] += dp[sum + 1000];
				}
			}
			dp = next;
		}
		return dp[S + 1000];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
