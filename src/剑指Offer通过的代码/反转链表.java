package ��ָOfferͨ���Ĵ���;

public class ��ת���� {
	public ListNode ReverseList(ListNode head) {

        ListNode pre=null;
        ListNode next=null;
        while(head != null){
            pre = head;
            head = head.next;
            pre.next = next;
            next = pre;
           
        }
        return pre;
    }
}
