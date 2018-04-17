package cn.edu.myxof.solution6;

public class Solution667 {
	public int[] constructArray(int n, int k) {
		int[] res = new int[n];
		int len = k / 2;
		for (int i = 0; i < len; i++) {
			res[2 * i] = i + 1;
			res[2 * i + 1] = n - i;
		}
		if (k % 2 == 0) {
			for (int i = n - 1; i >= k; i--) {
				res[i] = len + n - i;
			}
		} else {
			for (int i = k - 1; i < n; i++) {
				res[i] = i - len + 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
