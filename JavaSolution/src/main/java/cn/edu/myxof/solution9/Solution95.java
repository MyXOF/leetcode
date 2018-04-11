package cn.edu.myxof.solution9;

import java.util.ArrayList;
import java.util.List;

import cn.edu.myxof.utils.TreeNode;

public class Solution95 {

	public List<TreeNode> generateTrees(int n) {
		if (n <= 0)
			return new ArrayList<TreeNode>();
		return getTrees(1, n);
	}

	private List<TreeNode> getTrees(int start, int end) {
		List<TreeNode> res = new ArrayList<>();
		if (start > end) {
			res.add(null);
			return res;
		}
		if (start == end) {
			res.add(new TreeNode(start));
			return res;
		}

		for (int i = start; i <= end; i++) {
			List<TreeNode> ltree = getTrees(start, i - 1);
			List<TreeNode> rtree = getTrees(i + 1, end);
			for (TreeNode l : ltree) {
				for (TreeNode r : rtree) {
					TreeNode root = new TreeNode(i);
					root.left = l;
					root.right = r;
					res.add(root);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
