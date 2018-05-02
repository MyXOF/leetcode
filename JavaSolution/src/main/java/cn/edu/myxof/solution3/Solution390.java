package cn.edu.myxof.solution3;

public class Solution390 {
	public int lastRemaining(int n) {
		return ltr(n);
	}

	private int ltr(int n) {
		if (n <= 2)
			return n;
		return 2 * rtl(n / 2);
	}

	private int rtl(int n) {
		if (n <= 2)
			return 1;
		if (n % 2 == 1)
			return 2 * (ltr(n / 2));
		return 2 * ltr(n / 2) - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
