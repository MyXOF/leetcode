package cn.edu.myxof.solution2;

import java.util.Random;

public class Solution260 {
	public int[] singleNumber(int[] nums) {
		int[] res = { 0, 0 };
		if (nums == null || nums.length == 0) {
			return res;
		}
		int diff = 0;
		for (int n : nums) {
			diff ^= n;
		}
		int b = 1;
		while ((b & diff) == 0) {
			b <<= 1;
		}
		for (int n : nums) {
			if ((n & b) == 0) {
				res[0] ^= n;
			} else {
				res[1] ^= n;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(System.currentTimeMillis());
		int n = random.nextInt(10000);
		System.out.println(n);
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(-n));
		System.out.println(Integer.toBinaryString(n & (-n)));
	}

}
