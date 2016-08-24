package 程序员面试指南;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class 按之字形打印二叉树 {

	public ArrayList<ArrayList<Integer>> printNodes(Node head){
		 ArrayList <ArrayList<Integer>> list = new ArrayList();
			Queue<Node> queue = new LinkedList();
			ArrayList<Integer> list1 = new ArrayList();;
			if(head == null)
				return list;
		    Node last = head;
			Node nLast = null;
			boolean flg = false;
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
					if(flg)
						Collections.reverse(list1);
	                list.add(list1);
					list1 = new ArrayList();
	                last = nLast;
	                flg = !flg;
				}
			}
			return list;
	}
}
