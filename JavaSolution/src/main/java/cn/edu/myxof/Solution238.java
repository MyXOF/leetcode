package cn.edu.myxof;

public class Solution238 {
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		if (n <= 1) {
			return null;
		}
		int[] res = new int[n];
		res[0] = 1;
		for (int i = 1; i < n; i++) {
			res[i] = res[i - 1] * nums[i - 1];
		}
		int tmp = nums[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			res[i] *= tmp;
			tmp *= nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
