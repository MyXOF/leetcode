package cn.edu.myxof.solution5;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import cn.edu.myxof.utils.TreeNode;

public class Solution515 {
    public List<Integer> largestValues(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
    	if(root == null) return res;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        while(true) {
        	int next = 0;
        	int size = deque.size();
        	int maxValue = Integer.MIN_VALUE;
        	for(int i = 0; i < size;i++) {
        		TreeNode node = deque.pop();
        		maxValue = Math.max(maxValue, node.val);
        		if(node.left != null) {
        			deque.add(node.left);
        			next++;
        		}
        		if(node.right != null) {
        			deque.add(node.right);
        			next++;
        		}
        	}
        	res.add(maxValue);
        	if(next == 0) break;
        }
        return res;        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
