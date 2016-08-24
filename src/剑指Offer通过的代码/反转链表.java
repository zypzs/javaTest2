package 剑指Offer通过的代码;

public class 反转链表 {
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
