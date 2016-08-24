package LinkTest;

import java.util.Stack;

public class SingleLinkList {
	
	//����һ�������������ǽ������
	public static Node creatList(Node []nodes){
		Node head = nodes[0];
		if(head == null)
			return null;
		for(int i=0; i<nodes.length-1; i++){
			if(nodes[i] == null)         //���ǵ����������ܴ��ڿս�㣬���Լ��ж�
				break;
			nodes[i].next = nodes[i+1];
		}
		return head;
	}
	
	//��ͷ��㿪ʼ��ӡ����
	public static void printList(Node head){
		while(head != null){
			head.display();
			head = head.next;
			
		}
	}
	
	//��ӡ������������Ĺ�������
	public void printCommonPart(Node head1,Node head2){
		System.out.println("CommonParts:");
		while(head1 != null  && head2 != null ){
			if(head1.data == head2.data){
				head1.display();
				head1 = head1.next;
				head2 = head2.next;
			}else if(head1.data > head2.data){
				head2 = head2.next;
			}else{
				head1 = head1.next;
			}
		}
	}
	
	//ɾ��������м�ڵ�
	public Node deleteMidNode(Node head){
		if(head == null || head.next == null)
			return head;
		if(head.next.next == null){
			return head.next;
		}
		Node pre = head;
		Node cur = head.next.next;
		while(cur.next != null && cur.next.next != null){
			pre = pre.next;
			cur = cur.next.next;
		}
		pre.next = pre.next.next;
		return head;
	}
	
	//ɾ��������k����㲢��������
	public Node deleteLastKthNode(Node head,int k){
		Node pre = head;
		while(pre != null){
			pre = pre.next;
			k--;
		}
		if(k > 0)
			return null;
		else if(k == 0){
			head = head.next;
		}
		else{
			while(k < 0){
				pre = head;
				pre = pre.next;
				k++;
			}
			pre.next = pre.next.next;
		}
		return head;
	}
	
	
	//ʵ������ת
	public Node reserve(Node head){
		Node pre = null;
		Node temp = null;
		while(head != null){
			
			temp = head.next;
			head.next = pre;
			pre = head;
			head = temp;
		}
		return pre;
	}
	
	//ʵ�ֲ�������ת
	public Node reservePart(Node head , int from , int to){
		int pos = 0;
		Node cur = head;
		Node cur1 = null;
		Node cur2 = null;
		Node res = null;
		Stack<Node>stack = new Stack<Node>();
		while(pos < from-1){
			cur = cur.next;
			pos++;
		}
		cur1 = cur;
		cur = cur.next;
		pos++;
		while(pos <=to && cur != null){
			pos++;
			stack.push(cur);
			cur = cur.next;
		}
		cur2 = cur;
		if(from == 0 && !stack.isEmpty()){
			cur1 = stack.pop();
			res = cur1;
		}
		while(!stack.isEmpty()){
			cur1.next = stack.pop();
			cur1 = cur1.next;
		}
		
		if(from == 0){
			head.next = cur2;
			cur1.next = head;
			return res;
		}else{
			cur1.next = cur2;
			return head;
		}
	}

	//ʵ�ֲ�������ת2
	public Node reversePart(Node head, int from, int to){
		int len = 0;
		Node node1 = head;
		Node fPre = null;
		Node tPos = null;
		while(node1 != null){
			len++ ;
			fPre = len == from - 1 ? node1 : fPre;  //�ҵ���ʼλ�õ�ǰһ���ڵ�
			tPos = len == to + 1 ? node1 : tPos;    //�ҵ�����λ�õĺ�һ���ڵ�
			node1 = node1.next;
			if(len > to + 1)
				break;
		}
		if(from > to || from<1 || to>len){
			return head;
		}
		node1 = fPre == null ? head : fPre.next;   //�ж��Ƿ��Ǵӱ�ͷ��ʼ��
		Node node2 = node1.next;
		node1.next = tPos;
		Node next = null;
		while(node2 != tPos){
			next = node2.next;
			node2.next = node1;
			node1 = node2;
			node2 = next;
		}
		if(fPre != null){
			fPre.next = node1;
			return head;
		}
		return node1;
	}
	
	//�ж������Ƿ��ǻ��Ľṹ
	public boolean isPalindrome(Node head){
		Node cur = head;
		Stack<Node> stack = new Stack<Node>();
		while(cur != null){
			stack.add(cur);
			cur = cur.next;
		}
		while(head != null){
			if(head.data != stack.pop().data){
				return false;
			}
			head = head.next;
		}
		return true;
	}
	
	public boolean isPalindrome2(Node head){
		if(head == null || head.next == null){
			return false;
		}
		Node right = head.next;
		Node cur = head;
		//ֻ��������Ұ벿����ջ
		while(cur.next != null && cur.next.next != null){
			right = right.next;
			cur = cur.next.next;
		}
		Stack<Node>stack = new Stack<Node>();
		while(right != null){
			stack.push(right);
			right = right.next;
		}
		while(!stack.isEmpty()){
			if(head.data != stack.pop().data){
				return false;
			}
			head = head.next;
		}
		return true;
	}
	
	public boolean isPalindrome3(Node head){
		if(head == null || head.next == null){
			return false;
		}
		Node n1 = head;
		Node n2 = head;
		while(n2.next != null && n2.next.next != null){
			n1 = n1.next;              //�м��
			n2 = n2.next.next;         //���һ���ڵ�
		}
		n2 = n1.next;
		n1.next = null;
		Node n3= null;
		while(n2 != null){
			n3 = n2.next;
			n2.next = n1;
			n1 = n2;
			n2 = n3;
		}
		n3 = n1;
		n2 = head;
		boolean res = true;
		while(n1 != null && n2 != null){
			if(n1.data != n2.data){
				res = false;
				break;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		n1 = n3.next;
		n3.next = null;
		while(n1 != null){
			n2 = n1.next;
			n1.next = n3;
			n3 = n1;
			n1 = n2;
		}
		return res;
	}
	
	//ɾ�������е��ظ��ڵ㣻ע���׽ڵ��ظ���β�ڵ��ظ��������
	 public Node deleteDuplication(Node pHead)
	    {
		    Node res = new Node(-1);  //�����׽ڵ��ظ������
		    res.next = pHead;
	        Node last = res;
	        Node cur = pHead;
	        while(cur != null && cur.next != null){
	            if(cur.data == cur.next.data){
	            	int val = cur.data;       //�����������������
	              while(cur != null && cur.data == val){
	            		cur = cur.next;
	            		last.next = cur;
	            	}
	            }else{
	            	last = cur;
	            	cur = cur.next;
	            }
	        }
	           return res.next;
	    }
	 
	public static void main(String[] args) {
		SingleLinkList sl = new SingleLinkList();
		Node []nodes1 = {new Node(1),new Node(3),new Node(5),new Node(3),new Node(1)};
		Node head1 = sl.creatList(nodes1);
		sl.printList(head1);
		System.out.println();
		
		Node []nodes2 = {new Node(1),new Node(2),new Node(3),new Node(3),new Node(4),new Node(4),new Node(5)};
		Node head2 = sl.creatList(nodes2);
		//sl.printList(head2);
		//System.out.println();
		
		//sl.printCommonPart(head1, head2);
		
		//sl.printList(sl.deleteLastKthNode(head2, 3));
		//sl.printList(sl.deleteMidNode(head1));
		//sl.printList(sl.reserve(head1));
		//sl.printList(sl.reservePart(head1,0,5));
//		sl.printList(sl.reversePart(head1,1,4));
	//	System.out.println(sl.isPalindrome(head1));
		//System.out.println(sl.isPalindrome2(head1));
	//	System.out.println(sl.isPalindrome3(head1));
		sl.printList(sl.deleteDuplication(head2));
	}
}
