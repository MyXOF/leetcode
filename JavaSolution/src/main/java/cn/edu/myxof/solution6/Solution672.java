package cn.edu.myxof.solution6;

public class Solution672 {
	public int flipLights(int n, int m) {
		if (n <= 0)
			return 0;
		if (m == 0)
			return 1;
		n = Math.min(n, 3);
		if (m == 1) {
			return n + 1;
		}
		if (n == 1) {
			return 2;
		} else if (n == 2) {
			return 4;
		}
		return m == 2 ? 7 : 8;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
