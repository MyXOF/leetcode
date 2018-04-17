package cn.edu.myxof.solution2;

import cn.edu.myxof.utils.TreeNode;

public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        
        return invert(root);
    }
    
    private TreeNode invert(TreeNode root){
        if(root == null) return null;
        TreeNode res = new TreeNode(root.val);
        if(root.left == null && root.right != null){
            res.right = null;
            res.left = invert(root.right);
        } else if (root.left != null && root.right == null){
            res.right = invert(root.left);
            res.left = null;
        } else{
            res.right = invert(root.left);
            res.left = invert(root.right);
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
