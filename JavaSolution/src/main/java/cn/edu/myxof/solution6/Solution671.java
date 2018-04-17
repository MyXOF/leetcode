package cn.edu.myxof.solution6;

import cn.edu.myxof.utils.TreeNode;

public class Solution671 {
    int n1,n2;
    public int findSecondMinimumValue(TreeNode root) {
        n1 = Integer.MAX_VALUE;
        n2 = Integer.MAX_VALUE;
        travelTree(root);
        return n2 == n1 ? -1 : n2;
    }
    
    private void travelTree(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(n1 == n2){
                if(root.val < n1){
                    n1 = root.val;
                    n2 = n2 == Integer.MAX_VALUE ? n1 : n2;
                } else if(root.val > n1){
                    n2 = root.val;
                }
            } else{
                if(root.val < n1){
                    n2 = n1;
                    n1 = root.val;
                } else if(root.val < n2 && n1 < root.val){
                    n2 = root.val;
                }
            }
        }
        travelTree(root.left);
        travelTree(root.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
