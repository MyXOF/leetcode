package cn.edu.myxof;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution104 {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return getDepth(root, 1);
	}

	private int getDepth(TreeNode node, int depth) {
		if (node.left == null && node.right == null) {
			return depth;
		} else if (node.left != null && node.right == null) {
			return getDepth(node.left, depth + 1);
		} else if (node.left == null && node.right != null) {
			return getDepth(node.right, depth + 1);
		} else {
			int l = getDepth(node.left, depth + 1);
			int r = getDepth(node.right, depth + 1);
			return l >= r ? l : r;
		}

	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
