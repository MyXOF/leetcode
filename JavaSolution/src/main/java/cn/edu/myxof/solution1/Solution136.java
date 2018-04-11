package cn.edu.myxof.solution1;

public class Solution136 {
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int i : nums) {
			result ^= i;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
