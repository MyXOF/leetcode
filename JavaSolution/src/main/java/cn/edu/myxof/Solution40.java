package cn.edu.myxof;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		if (candidates == null || candidates.length == 0) {
			return res;
		}
		Arrays.sort(candidates);
		func(res, new ArrayList<Integer>(), target, 0, candidates);
		return res;
	}

	private void func(List<List<Integer>> res, List<Integer> tmp, int remain, int start, int[] candidates) {
		if (remain < 0) {
			return;
		} else if (remain == 0) {
			res.add(new ArrayList<Integer>(tmp));
		} else {
			for (int i = start; i < candidates.length; i++) {
				if (i > start && candidates[i] == candidates[i - 1])
					continue;
				tmp.add(candidates[i]);
				func(res, tmp, remain - candidates[i], i + 1, candidates);
				tmp.remove(tmp.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
