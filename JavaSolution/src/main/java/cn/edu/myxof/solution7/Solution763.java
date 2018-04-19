package cn.edu.myxof.solution7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution763 {
	public List<Integer> partitionLabels(String S) {
		List<Integer> result = new ArrayList<>();
		int len = S.length();
		int[][] info = new int[26][2];
		for (int i = 0; i < 26; i++) {
			info[i] = new int[2];
			info[i][0] = -1;
			info[i][1] = -1;
		}
		for (int i = 0; i < len; i++) {
			int index = S.charAt(i) - 'a';
			info[index][0] = info[index][0] == -1 ? i : info[index][0];
			info[index][1] = i;
		}
		Arrays.sort(info, (p1, p2) -> {
			return p1[0] - p2[0];
		});
		int lastStart = -1;
		int lastEnd = -1;
		boolean flag = true;
		for (int[] arr : info) {
			if (arr[0] == -1) {
				continue;
			}
			if (flag) {
				lastStart = arr[0];
				lastEnd = arr[1];
				flag = false;
				continue;
			}
			if (lastEnd < arr[0]) {
				result.add(lastEnd - lastStart + 1);
				lastStart = arr[0];
				lastEnd = arr[1];
			} else if (arr[0] < lastEnd && lastEnd < arr[1]) {
				lastEnd = arr[1];
			}
		}
		result.add(lastEnd - lastStart + 1);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String S = "ababcbacadefegdehijhklij";

	}

}
