package cn.edu.myxof.solution5;

public class Solution526 {
	private int count;

	public int countArrangement(int N) {
		// int[] res = {1,2,3,8,10,36,41,132,250,700,750,4010,4237,10680,24679};
		// return res[N-1];
		count = 0;
		boolean[] flags = new boolean[N + 1];
		func(N, 1, flags);
		return count;
	}

	private void func(int N, int pos, boolean[] flags) {
		if (pos > N)
			count++;
		for (int i = 1; i <= N; i++) {
			if (!flags[i] && (pos % i == 0 || i % pos == 0)) {
				flags[i] = true;
				func(N, pos + 1, flags);
				flags[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
