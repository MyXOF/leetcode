package cn.edu.myxof;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			nums[(nums[i] - 1) % len] += len;
		}
		for (int i = 0; i < len; i++) {
			if (nums[i] <= len) {
				res.add(i + 1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
