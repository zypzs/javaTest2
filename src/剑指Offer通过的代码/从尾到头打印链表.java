package 剑指Offer通过的代码;

import java.util.ArrayList;
import java.util.Stack;

	
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
	
	public class 从尾到头打印链表 {
	    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
	    while (listNode != null) {
	        stack.push(listNode.val);
	        listNode = listNode.next;
	    }

	    ArrayList<Integer> resultList = new ArrayList<>();
	    while (!stack.isEmpty()) {
	    	resultList.add(stack.pop());
	    }
	    return resultList;  
		
	        
	    }
}
