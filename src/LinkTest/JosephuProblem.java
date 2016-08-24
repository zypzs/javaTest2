package LinkTest;

public class JosephuProblem {
	//生成Josephu环
	public Node creatJosephu(){
		Node []nodes = new Node[41];
		for(int i =1; i <= 41; i++){
			nodes[i-1] = new Node(i);
		}
		Node head = nodes[0];
		for (int i = 0; i < nodes.length-1; i++) {
			nodes[i].next = nodes[i+1];
		}
		nodes[40].next = head; 
		return head;              
	}
	
	//  时间复杂度过高
	public Node josephuKill1(Node head1, int m){
		if(head1 == null || head1.next == null || m<1)
			return head1;
	  //找到头节点的上一个节点
		Node last = head1;
		while(last.next != head1){
			last = last.next;
		}
		int num = 0;
		while(head1 != null && head1.data != head1.next.data){
			if(++num ==3){
				last.next = head1.next;   //前一个节点指向该节点的下一个节点
				num = 0;
				//System.out.println(head1.data);
				head1 = head1.next;
				continue;
			}
			last = last.next;          //同时维护当前节点和当前节点的上一个节点
			head1 = head1.next;
		}
		return head1;
	}
	public static void main(String[] args) {
		JosephuProblem jp = new JosephuProblem();
		
		System.out.println(jp.josephuKill1(jp.creatJosephu(), 3).data);
	}

}
