package cn.edu.myxof.solution4;

public class Solution486 {

	public static boolean PredictTheWinner(int[] nums) {
		int len = nums.length;
		int[] dp = new int[len];
		for(int i = 0; i < len;i++) {
			for(int j = i-1;j >= 0;j--) {
				dp[len-j-1] = Math.max(nums[i]-dp[len-j-1], nums[j]-dp[len-j-2]);
			}
		}
		return dp[len-1] >= 0;
	}
	
	public static boolean PredictTheWinner2(int[] nums) {
		int len = nums.length;
		int[][] dp = new int[len][len];
		for(int i = 0; i < len;i++) {
			dp[i][i] = nums[i];
		}
		for(int i = 0; i < len;i++) {
			for(int j = i-1;j >= 0;j--) {
				dp[j][i] = Math.max(nums[i]-dp[j][i-1], nums[j]-dp[j+1][i]);
			}
		}
		return dp[0][len-1] >= 0;
	}
	
	public boolean PredictTheWinner3(int[] nums) {
		return func(nums, 0, nums.length - 1, 0);
	}

	private boolean func(int[] nums, int start, int end, int score) {
		if (start == end)
			return score + nums[start] >= 0;
		if (end - start == 1) {
			return score + Math.abs(nums[start] - nums[end]) >= 0;
		}
		return (func(nums, start + 2, end, score + nums[start] - nums[start + 1]) && func(nums, start + 1, end - 1, score + nums[start] - nums[end])
				|| (func(nums, start, end - 2, score + nums[end] - nums[end - 1]) && func(nums, start + 1, end - 1, score - nums[start] + nums[end])));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,55,6,8};
//		int[] nums = {2,5,1};
		System.out.println(PredictTheWinner2(nums));
		System.out.println(PredictTheWinner(nums));
	}

}
