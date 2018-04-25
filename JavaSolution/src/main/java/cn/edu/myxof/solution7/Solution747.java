package cn.edu.myxof.solution7;

public class Solution747 {
	public int dominantIndex(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return 0;
		}
		int len = nums.length;
		int maxIndex1 = -1, maxIndex2 = 0, maxValue1 = -1, maxValue2 = nums[0];
		for (int i = 1; i < len; i++) {
			if (nums[i] >= maxValue2) {
				maxValue1 = maxValue2;
				maxIndex1 = maxIndex2;
				maxValue2 = nums[i];
				maxIndex2 = i;
			} else if (maxValue1 < nums[i]) {
				maxValue1 = nums[i];
				maxIndex1 = i;
			}
		}
		return maxValue2 >= maxValue1 * 2 ? maxIndex2 : -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
