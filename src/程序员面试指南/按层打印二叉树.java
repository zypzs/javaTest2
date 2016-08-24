package 程序员面试指南;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
	int val;
	Node left;
	Node right;
	public Node(int val){
		this.val = val;
	}
}

public class 按层打印二叉树 {
	public ArrayList<ArrayList<Integer>> printByLevel(Node head){
		 ArrayList <ArrayList<Integer>> list = new ArrayList();
			Queue<Node> queue = new LinkedList();
			ArrayList<Integer> list1 = new ArrayList();;
			if(head == null)
				return list;
		    Node last = head;
			Node nLast = null;
			queue.offer(head);
			while(!queue.isEmpty()){
	            
				head = queue.poll();
				list1.add(head.val);
				if(head.left != null){
					queue.offer(head.left);
					nLast = head.left;
				}
				if(head.right != null){
					queue.offer(head.right);
					nLast = head.right;
				}
				if(head == last ){
	                list.add(list1);
	                
					list1 = new ArrayList();
	                last = nLast;
				}
			}
			return list;
	}

}
