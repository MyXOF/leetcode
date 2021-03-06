package cn.edu.myxof.solution4;

import java.util.ArrayList;
import java.util.List;

public class Solution442 {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		if (nums == null) {
			return res;
		}
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0) {
				res.add(Math.abs(nums[i]));
			} else {
				nums[index] = -nums[index];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] nums = {4,3,2,7,8,2,3,1};

	}

}
