package cn.edu.myxof;

import java.util.Arrays;

public class Solution621 {
	public int leastInterval(char[] tasks, int n) {
		int[] map = new int[26];
		for (char c : tasks) {
			map[c - 'A'] += 1;
		}
		Arrays.sort(map);
		int maxValue = map[25] - 1;
		int idleSlot = maxValue * n;
		for (int i = 24; i > 0 && map[i] > 0; i--) {
			idleSlot -= Math.min(maxValue, map[i]);
		}
		return idleSlot > 0 ? tasks.length + idleSlot : tasks.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
