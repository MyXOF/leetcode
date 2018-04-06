package cn.edu.myxof;

public class Soltion279 {
	public int numSquares(int n) {
		if (isSqrt(n))
			return 1;
		// The result is 4 if and only if n can be written in the
		// form of 4^k*(8*m + 7)
		int tmp = n;
		while ((tmp & 3) == 0) {
			tmp >>= 2;
		}
		if ((tmp & 7) == 7) {
			return 4;
		}

		int maxSqrt = (int) Math.sqrt(n);
		for (int i = 0; i <= maxSqrt; i++) {
			if (isSqrt(n - i * i)) {
				return 2;
			}
		}
		return 3;
	}

	private boolean isSqrt(int n) {
		double res = Math.sqrt((double) n);
		return n == ((int) res * (int) res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
