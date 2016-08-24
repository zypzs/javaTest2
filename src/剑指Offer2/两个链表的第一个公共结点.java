package 剑指Offer2;

import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class 两个链表的第一个公共结点 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 
        Map<ListNode,Integer>  hashMap = new HashMap<ListNode,Integer>();
    	while(pHead1 != null){
    		hashMap.put(pHead1, pHead1.val);
    		pHead1 = pHead1.next;
    	}
    	while(pHead2 != null){
    		if(hashMap.containsKey(pHead2)){
    			break;
    		}
    		pHead2 = pHead2.next;
    	}
    	return pHead2;
    }
}
