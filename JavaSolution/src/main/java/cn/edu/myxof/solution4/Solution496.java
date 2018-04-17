package cn.edu.myxof.solution4;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution496 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> mapping = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		for (int n : nums2) {
			while (!stack.isEmpty() && stack.peek() < n) {
				mapping.put(stack.pop(), n);
			}
			stack.push(n);
		}
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = mapping.getOrDefault(nums1[i], -1);
		}
		return nums1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
