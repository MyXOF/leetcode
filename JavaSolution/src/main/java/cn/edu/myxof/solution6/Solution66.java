package cn.edu.myxof.solution6;

public class Solution66 {
	public int[] plusOne(int[] digits) {
		if (digits == null || digits.length == 0)
			return null;
		int len = digits.length;
		int next = 1;
		for (int i = len - 1; i > 0; i--) {
			int tmp = next;
			next = (digits[i] + tmp) / 10;
			digits[i] = (digits[i] + tmp) % 10;
			if (next == 0)
				return digits;
		}
		if (digits[0] == 9 && next == 1) {
			int[] nums = new int[len + 1];
			nums[0] = 1;
			return nums;
		} else {
			digits[0]++;
			return digits;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
