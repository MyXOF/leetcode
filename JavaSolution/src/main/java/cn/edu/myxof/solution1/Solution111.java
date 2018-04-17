package cn.edu.myxof.solution1;

import cn.edu.myxof.utils.TreeNode;

public class Solution111 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        // if(root.left == null) return getDepth(root.right,1);
        // if(root.right == null) return getDepth(root.left, 1);
        return getDepth(root,0);
    }
    
    private int getDepth(TreeNode root, int depth){
        if(root == null){return depth;}
        if(root.left == null && root.right == null){return depth+1;}
        else if(root.left != null && root.right == null) {return getDepth(root.left, depth+1);}
        else if(root.left == null && root.right != null) {return getDepth(root.right, depth+1);}
        return Math.min(getDepth(root.left, depth+1) ,getDepth(root.right, depth+1));
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
