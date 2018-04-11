package cn.edu.myxof.solution5;

import java.util.HashMap;
import java.util.Map;

public class Solution560 {
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		int sum = 0;
		Map<Integer, Integer> mapping = new HashMap<Integer, Integer>();
		mapping.put(0, 1);
		for (int n : nums) {
			sum += n;
			if (mapping.containsKey(sum - k)) {
				count += mapping.get(sum - k);
			}
			mapping.put(sum, mapping.getOrDefault(sum, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
