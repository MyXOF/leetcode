package cn.edu.myxof;

public class Solution461 {
	public int hammingDistance(int x, int y) {
		int result = 0;
		int tmp = x ^ y;
		while (tmp != 0) {
			if ((tmp & 1) > 0) {
				result++;
			}
			tmp = tmp >> 1;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
