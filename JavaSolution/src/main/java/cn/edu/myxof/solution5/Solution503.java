package cn.edu.myxof.solution5;

import java.util.Stack;

public class Solution503 {
	public int[] nextGreaterElements(int[] nums) {
		if (nums == null)
			return null;
		int len = nums.length;
		int[] res = new int[len];
		if (len == 0)
			return res;
		Stack<Integer> stack = new Stack<>();
		for (int i = 2 * len - 1; i >= 0; i--) {
			int index = i % len;
			while (!stack.isEmpty() && stack.peek() <= nums[index]) {
				stack.pop();
			}
			res[index] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(nums[index]);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] nums = {1,2,1};

	}

}
