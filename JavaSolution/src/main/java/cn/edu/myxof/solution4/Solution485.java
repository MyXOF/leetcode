package cn.edu.myxof.solution4;

public class Solution485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int count = 0;
		int maxNum = 0;
		int lastNum = 1;
		for (int n : nums) {
			if (n == 1) {
				if (lastNum == 1) {
					count++;
				} else {
					lastNum = 1;
					maxNum = Math.max(maxNum, count);
					count = 1;
				}
			} else {
				maxNum = Math.max(maxNum, count);
				count = 0;
			}
		}
		return maxNum = Math.max(maxNum, count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
