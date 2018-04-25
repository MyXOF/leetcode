package cn.edu.myxof.solution2;

import java.util.HashMap;
import java.util.Map;

public class Solution219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums == null || nums.length <= 1 || k < 1)
			return false;
		int len = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < len; i++) {
			if (map.containsKey(nums[i])) {
				int index = map.get(nums[i]);
				if (i - index <= k) {
					return true;
				} else {
					map.put(nums[i], i);
				}
			} else {
				map.put(nums[i], i);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
