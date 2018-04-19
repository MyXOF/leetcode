package cn.edu.myxof.solution5;

import java.util.Deque;
import java.util.LinkedList;

import cn.edu.myxof.utils.TreeNode;

public class Solution513 {
    public int findBottomLeftValue(TreeNode root) {
    	if(root.left == null && root.right == null) return root.val;
        Deque<TreeNode> deque = new LinkedList<>();
        int res = root.val;
        deque.push(root);
        while(true) {
        	int next = 0;
        	int size = deque.size();
        	res = deque.peek().val;
        	for(int i = 0; i < size;i++) {
        		TreeNode node = deque.pop();
        		if(node.left != null) {
        			deque.add(node.left);
        			next++;
        		}
        		if(node.right != null) {
        			deque.add(node.right);
        			next++;
        		}
        	}
        	if(next == 0) break;
        }
        return res;        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
