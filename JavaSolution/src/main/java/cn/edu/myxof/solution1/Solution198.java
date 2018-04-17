package cn.edu.myxof.solution1;

public class Solution198 {
	public int rob(int[] nums) {
		if (nums == null) {
			return 0;
		}
		int len = nums.length;
		if (len == 0)
			return 0;
		if (len == 1)
			return nums[0];
		int preNowork = nums[0];
		int preWork = nums[1];
		for (int i = 2; i < len; i++) {
			int tmp = preNowork;
			preNowork = Math.max(preNowork, preWork);
			preWork = tmp + nums[i];
		}
		return Math.max(preNowork, preWork);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
