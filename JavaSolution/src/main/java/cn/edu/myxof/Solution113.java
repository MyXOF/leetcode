package cn.edu.myxof;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import cn.edu.myxof.utils.TreeNode;

public class Solution113 {
	List<List<Integer>> res;

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		res = new ArrayList<>();
		if (root == null)
			return res;
		Stack<Integer> stack = new Stack<Integer>();
		func(root, sum, stack);
		return res;
	}

	private void func(TreeNode root, int sum, Stack<Integer> stack) {
		if (root == null)
			return;
		stack.push(root.val);
		if (root.left == null && root.right == null && root.val == sum) {
			res.add(new ArrayList<Integer>(stack));
		}
		func(root.left, sum - root.val, stack);
		func(root.right, sum - root.val, stack);
		stack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
