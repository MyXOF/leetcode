package cn.edu.myxof.solution7;

import java.util.Stack;

public class Solution739 {
	public int[] dailyTemperatures(int[] temperatures) {
		if (temperatures == null || temperatures.length == 0) {
			return null;
		}
		int len = temperatures.length;
		int[] res = new int[len];
		Stack<Integer> stack = new Stack<>();
		for (int i = len - 1; i >= 0; i--) {
			while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
				stack.pop();
			}
			res[i] = stack.isEmpty() ? 0 : stack.peek() - i;
			stack.push(i);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
