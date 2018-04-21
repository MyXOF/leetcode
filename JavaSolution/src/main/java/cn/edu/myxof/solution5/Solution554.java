package cn.edu.myxof.solution5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution554 {
	public int leastBricks(List<List<Integer>> wall) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (List<Integer> w : wall) {
			int len = 0;
			for (int i = 0; i < w.size()-1;i++) {
				len += w.get(i);
				int edge = map.getOrDefault(len, 0);
				map.put(len, edge + 1);
				count = Math.max(count, edge+1);
			}
		}
		return wall.size() - count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
