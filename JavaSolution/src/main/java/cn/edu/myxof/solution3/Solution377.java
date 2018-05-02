package cn.edu.myxof.solution3;

import java.util.HashMap;
import java.util.Map;

public class Solution377 {
	Map<Integer, Integer> map = new HashMap<>();

	public int combinationSum4(int[] nums, int target) {
		if (nums == null || nums.length == 0 || target < 0)
			return 0;
		if (target == 0)
			return 1;
		if (map.containsKey(target))
			return map.get(target);

		int count = 0;
		for (int n : nums) {
			count += combinationSum4(nums, target - n);
		}
		map.put(target, count);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
