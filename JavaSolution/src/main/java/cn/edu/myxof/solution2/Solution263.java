package cn.edu.myxof.solution2;

public class Solution263 {
	public boolean isUgly(int num) {
		if (num == 1) {
			return true;
		}
		return func(func(func(num, 2), 3), 5) == 1;
	}

	private int func(int num, int p) {
		while (num % p == 0 && num != 0) {
			num /= p;
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
