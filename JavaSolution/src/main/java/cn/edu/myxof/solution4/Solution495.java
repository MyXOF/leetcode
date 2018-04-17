package cn.edu.myxof.solution4;

public class Solution495 {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		if (timeSeries == null || timeSeries.length == 0) {
			return 0;
		}
		int count = duration;
		int lastTime = timeSeries[0];
		int len = timeSeries.length;
		for (int i = 1; i < len; i++) {
			count += duration;

			if (lastTime + duration > timeSeries[i]) {
				count -= (lastTime + duration - timeSeries[i]);
			}
			lastTime = timeSeries[i];

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
