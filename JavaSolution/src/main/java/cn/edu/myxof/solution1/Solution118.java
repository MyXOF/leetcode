package cn.edu.myxof.solution1;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		if (numRows <= 0)
			return res;
		List<Integer> first = new ArrayList<>();
		first.add(1);
		res.add(first);
		for (int i = 2; i <= numRows; i++) {
			List<Integer> tmp = new ArrayList<>();
			tmp.add(1);
			List<Integer> last = res.get(res.size() - 1);
			for (int j = 1; j < last.size(); j++) {
				tmp.add(last.get(j - 1) + last.get(j));
			}
			tmp.add(1);
			res.add(tmp);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
