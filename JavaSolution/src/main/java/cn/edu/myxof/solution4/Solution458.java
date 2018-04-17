package cn.edu.myxof.solution4;

public class Solution458 {
	public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
		if (buckets <= 0 || minutesToDie > minutesToTest) {
			return -1;
		}
		if (buckets == 1) {
			return 0;
		}
		int edge = ((int) ((double) minutesToTest / minutesToDie)) + 1;
		int num = edge;
		int pig = 1;
		while (true) {
			if (num >= buckets) {
				return pig;
			} else {
				num *= edge;
				pig++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
