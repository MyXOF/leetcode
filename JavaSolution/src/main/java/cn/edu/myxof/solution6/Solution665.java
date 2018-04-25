package cn.edu.myxof.solution6;

public class Solution665 {
	public boolean checkPossibility(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;
		int len = nums.length;
		if (len <= 2)
			return true;
		boolean flag = false;
		int index = -1;
		for (int i = 0; i < len - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				if (flag)
					return false;
				else {
					index = i;
					flag = true;
				}
			}
		}
		if (flag) {
			if (index == 0 || index == len - 2)
				return true;
			if (nums[index - 1] <= nums[index + 1] || nums[index] <= nums[index + 2])
				return true;
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
