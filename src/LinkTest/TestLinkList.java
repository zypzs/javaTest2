package LinkTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class TestLinkList {

	 public static void main(String[] args) {  
	        LinkList linkList = new LinkList();  
	        linkList.addFirstNode(20);  
	        linkList.addFirstNode(21);  
	        linkList.addFirstNode(19);  
	         //print19,21,20  
	        linkList.add(1, 22); //print19,22,21,20  
	        linkList.add(2, 23); //print19,22,23,21,20  
	        linkList.add(3, 99); //print19,22,23,99,21,20  
	      //调用此方法会print 19,22,23,99,21,20 
	        linkList.displayAllNodes();  
	        
	        linkList.first = linkList.resive();
	        linkList.displayAllNodes(); 
	        
	        /*LinkList linkList1 = new LinkList();
	        linkList1.addFirstNode(15);
	        linkList1.addFirstNode(24);
	        linkList1.addFirstNode(27);*/
	        }
}


 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
 class Solution {
	 //两个有序链表合并
    public ListNode Merge(ListNode list1,ListNode list2) {
    	if (list1 == null || list2 ==null){
    		return list1 != null ? list1 :list2;
    	}
    	ListNode head = list1.val < list2.val ? list1 : list2;
    	ListNode cur1 = head == list1 ? list1 : list2;
    	ListNode cur2 = head == list1 ? list2 : list1;
    	ListNode pre = null;
    	ListNode next = null;
    	while(cur1 != null && cur2 !=null){
    		if(cur1.val <= cur2.val){
    			pre = cur1;
    			cur1 = cur1.next;
    		}
    		else{
    			next = cur2.next;
    			pre.next = cur2;
    			cur2.next = cur1;
    			pre = cur2;
    			cur2 = next;
    		}
    	}
    pre.next = cur1 == null ? cur2 :cur1;
    return head;
    }
    
    //查找两个链表的第一个公共节点
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
