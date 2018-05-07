package cn.edu.myxof.solution8;

public class Solution829 {
	public int consecutiveNumbersSum(int N) {
		int k = 1;
		int count = 0;
		int end = 2 * N;
		while (k * k < end) {
			if (end % k == 0) {
				int tmp = end / k - k - 1;
				if (tmp % 2 == 0)
					count++;
			}
			k++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
