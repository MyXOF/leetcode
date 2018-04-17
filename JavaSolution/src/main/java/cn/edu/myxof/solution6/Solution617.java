package cn.edu.myxof.solution6;

import cn.edu.myxof.utils.TreeNode;

public class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        return mergeSubTree(t1, t2);
    }
    
    private TreeNode mergeSubTree(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null) return null;
        if(t1 == null && t2 != null) return t2;
        if(t1 != null && t2 == null) return t1;
        TreeNode tree = new TreeNode(t1.val+t2.val);
        tree.left =  mergeSubTree(t1.left, t2.left);
        tree.right =  mergeSubTree(t1.right, t2.right);
        return tree;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
