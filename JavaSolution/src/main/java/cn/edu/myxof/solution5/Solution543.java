package cn.edu.myxof.solution5;

import cn.edu.myxof.utils.TreeNode;

public class Solution543 {
    int res;
    public int diameterOfBinaryTree(TreeNode root) {
        res = 1;
        getDepth(root);
        return res-1;
    }
    
    private int getDepth(TreeNode root){
        if(root == null) return 0;
        int l = getDepth(root.left);
        int r = getDepth(root.right);
        res = Math.max(res,l+r+1);
        return Math.max(l,r)+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
