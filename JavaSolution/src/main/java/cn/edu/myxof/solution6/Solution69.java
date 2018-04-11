package cn.edu.myxof.solution6;

public class Solution69 {
	public int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}
		return func(x, 1, x);
		// return (int) Math.sqrt(x);
	}

	private int func(int x, int start, int end) {
		if (start == end)
			return start;
		if (start == end - 1) {
			if (end <= x / end)
				return end;
			else
				return start;
		}
		int mid = start + (end - start) / 2;

		if (mid > x / mid) {
			return func(x, start, mid - 1);
		} else {
			return func(x, mid, end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
