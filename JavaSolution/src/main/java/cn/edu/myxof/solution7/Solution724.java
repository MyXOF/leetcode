package cn.edu.myxof.solution7;

public class Solution724 {
	public int pivotIndex(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;
		int len = nums.length;
		int sum = 0;
		for (int n : nums) {
			sum += n;
		}
		int tmp = 0;
		for (int i = 0; i < len; i++) {
			if (tmp * 2 + nums[i] == sum)
				return i;
			tmp += nums[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
