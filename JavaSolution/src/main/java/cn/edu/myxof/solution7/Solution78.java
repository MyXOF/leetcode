package cn.edu.myxof.solution7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution78 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return res;
		Arrays.sort(nums);
		List<Integer> empty = new ArrayList<>();
		res.add(empty);
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			int preNum = res.size();
			for (int p = 0; p < preNum; p++) {
				List<Integer> tmp = new ArrayList<>(res.get(p));
				tmp.add(nums[i]);
				res.add(new ArrayList<>(tmp));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
