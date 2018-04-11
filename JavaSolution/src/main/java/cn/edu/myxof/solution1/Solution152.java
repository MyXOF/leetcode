package cn.edu.myxof.solution1;

public class Solution152 {
	public int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int len = nums.length;
		int max = nums[0];
		int min = nums[0];
		int res = nums[0];
		for (int i = 1; i < len; i++) {
			int tmp = max;
			max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
			min = Math.min(Math.min(nums[i] * tmp, nums[i] * min), nums[i]);
			res = max > res ? max : res;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
