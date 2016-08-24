package 剑指Offer2;

import java.util.*;

public class 二叉树中和为某一值的路径 {
	 public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	        ArrayList<ArrayList<Integer>> pathList=
	                new ArrayList<ArrayList<Integer>>();
	        if(root==null)
	            return pathList;
	        Stack<Integer> stack=new Stack<Integer>();
	        findPath(root,target,stack,pathList );
	        return pathList;
	    }
	    
	    private void findPath(TreeNode root,int target,Stack<Integer> path,
	                          ArrayList<ArrayList<Integer>> pathList){
	         if(root==null)
	            return;
	        if(root.left==null&&root.right==null){
	            if(root.val==target){
	                ArrayList<Integer> list=
	                        new ArrayList<Integer>();
	                for(int i:path){
	                    list.add(new Integer(i));
	                }
	                list.add(new Integer(root.val));
	                pathList.add(list);
	            }
	        }
	        else{
	            path.push(new Integer(root.val));
	            findPath(root.left, target-root.val, path, pathList);
	            findPath(root.right, target-root.val, path,  pathList);
	            path.pop();
	        }
	         
	    }
}
