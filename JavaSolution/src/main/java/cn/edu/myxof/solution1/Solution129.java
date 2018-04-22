package cn.edu.myxof.solution1;

import cn.edu.myxof.utils.TreeNode;

public class Solution129 {
	public int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		return func(root, 0);
	}

	private int func(TreeNode node, int val) {
		if (node.left == null && node.right == null) {
			return 10 * val + node.val;
		}
		if (node.left == null && node.right != null) {
			return func(node.right, val * 10 + node.val);
		}
		if (node.left != null && node.right == null) {
			return func(node.left, val * 10 + node.val);
		}
		return func(node.left, val * 10 + node.val) + func(node.right, val * 10 + node.val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
