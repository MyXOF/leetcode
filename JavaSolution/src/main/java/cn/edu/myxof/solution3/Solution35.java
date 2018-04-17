package cn.edu.myxof.solution3;

public class Solution35 {
	public int searchInsert(int[] nums, int target) {
		int result = 0;
		int l = nums.length;
		if (target < nums[0])
			return 0;
		if (target > nums[l - 1])
			return l;
		for (int i = 0; i < l; i++) {
			if (nums[i] == target) {
				return i;
			}
			if (nums[i] < target && target < nums[i + 1]) {
				return i + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
