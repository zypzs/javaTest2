package ��ָOffer2;

import java.util.*;

public class �������´�ӡ������ {
	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	        
	        ArrayList<Integer> aList = new ArrayList<Integer>();
	        Queue <TreeNode> queue = new LinkedList<TreeNode>();
	        if (root == null)
	            return aList;
	        TreeNode head = null;
	        	queue.offer(root);
	        while(!queue.isEmpty()){
	            head = queue.poll();
	            aList.add(head.val);
	            if(head.left != null){
	                queue.offer(head.left);
	            }
	            if(head.right != null){
	                queue.offer(head.right);
	            }
	        }
	        return aList;
	    }
}
