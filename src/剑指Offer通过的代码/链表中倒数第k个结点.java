package ��ָOfferͨ���Ĵ���;

public class �����е�����k����� {
	 public ListNode FindKthToTail(ListNode head,int k) {

         if(head == null || k<=0) return null;
         ListNode p1 = head;
         ListNode p2 = head;
        
         for(int i=0;i<k-1;i++) {
             if(p2==null) return null;
             p2 = p2.next;
         }
         if(p2==null) return null;
         while(p2.next!=null) {
             p1=p1.next;
             p2=p2.next;
         }
         return p1;
    }
}
