package cn.edu.myxof.solution1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import cn.edu.myxof.utils.TreeNode;

public class Solution107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			List<Integer> res = new ArrayList<>();
			int size = q.size();
			for (int i = 0; i < size; i++) {
				if (q.peek().left != null)
					q.offer(q.peek().left);
				if (q.peek().right != null)
					q.offer(q.peek().right);
				res.add(q.poll().val);
			}
			result.add(0, res);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
