package 剑指Offer2;

import java.util.LinkedList;
import java.util.Queue;

public class 二叉搜索树与双向链表 {
	 public TreeNode Convert(TreeNode pRootOfTree) {
	        if(pRootOfTree == null){
	            return null;
	        }
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        insertToQueue(pRootOfTree,queue);

	        TreeNode head = queue.poll();
	        TreeNode pre = head;
	        pre.left = null;
	        TreeNode cur = null;
	        while(!queue.isEmpty()){
	            cur = queue.poll();
	            pre.right = cur;
	            cur.left = pre;
	            pre = cur;
	        }
	        pre.right = null;
	        return head;
		    }
		private void insertToQueue(TreeNode root, Queue<TreeNode> queue) {

			if(root == null){
				return ;
			}
			insertToQueue(root.left,queue);
			queue.offer(root);
			insertToQueue(root.right,queue);
			}
}
