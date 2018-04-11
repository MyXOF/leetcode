package cn.edu.myxof.solution1;

public class Solution189 {
	public void rotate(int[] nums, int k) {
		if (nums == null || nums.length == 0 || nums.length == 1 || k <= 0) {
			return;
		}
		int len = nums.length;
		k = len - k % len;
		swap(nums, 0, k - 1);
		swap(nums, k, len - 1);
		swap(nums, 0, len - 1);
	}

	private void swap(int[] nums, int start, int end) {
		if (start >= end)
			return;
		for (int i = start, j = end; i <= j; i++, j--) {
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
