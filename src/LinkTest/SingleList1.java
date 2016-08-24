package LinkTest;

import java.util.Stack;

public class SingleList1 {

	//���������������������
	public static Node addList(Node head1, Node head2){
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		while(head1 != null){
			stack1.add(head1);
			head1 = head1.next;
		}
		while(head2 != null){
			stack2.add(head2);
			head2 = head2.next;
		}
		Node head = null;
		Node pre = null;
		boolean flag = false;
		int n,n1,n2;
		while(!stack1.isEmpty() || !stack2.isEmpty()){
			n = 0;
			n1 = !stack1.isEmpty() ? stack1.pop().data : 0;
			n2 = !stack2.isEmpty() ? stack2.pop().data : 0;
			n = n1 + n2;
			if(flag){
				n = n+1;
				flag = false;
			}
			if(n >= 10){
				n = n%10;
				flag = true;
			}
			head = new Node(n);
			head.next = pre;
			pre = head;
		}
		//�ж����Ľ�λ
		if(flag){
			head = new Node(1);
			head.next = pre;
		}
		return head;
	}
	//���������ÿK���ڵ����������󲻹�K���ڵ��򱣳�˳�򲻱�
	public static Node reverseKNodes(Node head, int k){
		Node pre = null;
		Node last = head;
		Node next = null;
		Node cur = null;
		int num = 0;
		boolean flag = false;
		Node res = head;
		Stack <Node> stack = new Stack<Node>();
		while(head != null){
			next = head.next;    //��¼��һ���ڵ㣬��������֮������
			stack.push(head);
			if(++num == k){    //�ﵽ�����������ִ��
				num = 0;
				pre = next;
				while(!stack.isEmpty()){
					cur = stack.pop();
					if(!flag){         //��һ������ʱ���ҵ��任���ͷ�ڵ�
						res = cur;
						flag = true;
					}
					last.next = cur;  //last����һ���ڵ㣬��ʼ��Ϊhead
					last = last.next;
				}
				last.next = pre;
			}
			head = next;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Node []nodes1 = {new Node(1),new Node(2),new Node(3),new Node(9),new Node(2),new Node(7)};
		Node []nodes2 = {new Node(9),new Node(2),new Node(7)};
		Node head1 = SingleLinkList.creatList(nodes1);
		Node head2 = SingleLinkList.creatList(nodes2);
	//	Node head = addList(head1,head2);
		SingleLinkList.printList(reverseKNodes(head1,4));
	}
}
