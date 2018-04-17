package cn.edu.myxof.solution1;

import cn.edu.myxof.utils.TreeNode;

public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || func(root.left, root.right);
    }
    
    private boolean func(TreeNode l,TreeNode r){
        if(l == null || r == null) return l == r;
        if(l.val != r.val) return false;
        return func(l.left, r.right) && func(l.right, r.left);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
