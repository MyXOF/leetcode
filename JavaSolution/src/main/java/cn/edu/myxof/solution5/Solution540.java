package cn.edu.myxof.solution5;

public class Solution540 {
	public int singleNonDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int len = nums.length;
		if (len == 1) {
			return nums[0];
		}
		return func(nums, 0, len - 1);
	}

	private int func(int[] nums, int start, int end) {
		if (start == end)
			return nums[start];
		int mid = start + (end - start) / 2;

		if (mid % 2 == 0) {
			if (nums[mid] == nums[mid + 1]) {
				return func(nums, mid, end);
			} else {
				return func(nums, start, mid);
			}
		} else {
			if (nums[mid] == nums[mid - 1]) {
				return func(nums, mid + 1, end);
			} else {
				return func(nums, start, mid - 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
