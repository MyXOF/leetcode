package cn.edu.myxof.solution3;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		if (candidates == null || candidates.length == 0) {
			return res;
		}
//		Arrays.sort(candidates);
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
				tmp.add(candidates[i]);
				func(res, tmp, remain - candidates[i], i, candidates);
				tmp.remove(tmp.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
