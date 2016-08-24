package 剑指Offer2;

public class 复杂链表的复制 {
	 public RandomListNode Clone(RandomListNode pHead)
	    {
	        if(pHead == null)
	            return null;
	    	RandomListNode answer = new RandomListNode(pHead.label);
	    	RandomListNode head = answer;
	    	if(pHead.random != null){
	    		answer.random = new RandomListNode(pHead.random.label);
	    	}
	    	while(pHead.next != null){
	    		pHead = pHead.next;
	    		head.next = new RandomListNode(pHead.label);
	    		if(pHead.random != null){
	    	 	head.next.random = new RandomListNode(pHead.random.label);	
	    		}
	    		head = head.next;
	    	}
			return answer;
	    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
