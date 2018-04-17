package cn.edu.myxof.solution1;

import cn.edu.myxof.utils.TreeNode;

public class Solution110 {
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		return (Math.abs(getDepth(root.left, 1) - getDepth(root.right, 1)) <= 1) && isBalanced(root.left)
				&& isBalanced(root.right);
	}

	private int getDepth(TreeNode root, int depth) {
		if (root == null) {
			return depth;
		}
		if (root.left == null && root.right == null) {
			return depth + 1;
		}
		return Math.max(getDepth(root.left, depth + 1), getDepth(root.right, depth + 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
