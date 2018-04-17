package cn.edu.myxof.solution2;

import java.util.ArrayList;
import java.util.List;

import cn.edu.myxof.utils.TreeNode;

public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root != null){
            findPath(root, root.val+"", res);
        }
        return res;
    }
    
    private void findPath(TreeNode root, String path, List<String> paths){

        if(root.left == null && root.right == null){
            paths.add(path);
        } else if(root.left != null && root.right == null){
            findPath(root.left, path+"->"+root.left.val, paths);
        } else if(root.left == null && root.right != null){
            findPath(root.right, path+"->"+root.right.val, paths);
        } else{
            findPath(root.left, path+"->"+root.left.val, paths);
            findPath(root.right, path+"->"+root.right.val, paths);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
