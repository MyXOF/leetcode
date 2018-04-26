package cn.edu.myxof.solution2;

public class Solution283 {
	public void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0)
			return;
		int len = nums.length;
		int zeroIndex = -1;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 0) {
				if (zeroIndex == -1) {
					zeroIndex = i;
				}
			} else {
				if (zeroIndex > -1) {
					swap(nums, i, zeroIndex);
					zeroIndex++;
				}
			}
		}

	}

	private void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
