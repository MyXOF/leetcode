package cn.edu.myxof.solution5;

public class Solution {
	public double myPow(double x, int n) {
		if (n == -2)
			return 1 / (x * x);
		if (n == -1)
			return 1 / x;
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		if (n == 2)
			return x * x;

		int left = n / 2;
		int right = n - left;
		double res = myPow(x, left);
		if (left == right) {
			return res * res;
		} else if (left > 0) {
			return res * res * x;
		} else {
			return res * res / x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
