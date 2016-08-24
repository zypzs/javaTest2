package LinkTest;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
/**
 * 复杂链表的复制
 * @author Administrator
 *
 */
public class RandomList {
	public RandomListNode first;//定义头结点
	public int pos = 0;    //定义元素位置
	//实现链表复制
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
    
    //添加头结点
    public void addHead(int data){
    	RandomListNode node = new RandomListNode(data);
    	node.next = first;
    	first = node;
    }
    
    public RandomListNode findNodeByIndex(int index){
    	RandomListNode node = first;
    	while(pos != index){
    		pos ++;
    		node = node.next;
    	}
    	return node;
    }
    
    //从固定索引开始输出链表
    public void printPart(int index){
    	pos = 0;
    	if(index < pos)
    		return ;
    	RandomListNode node = first;
    	while(pos != index){
    		pos++;
    		node = node.next;
    	}
    	while(node != null){
    		System.out.println(node.label);
    		node = node.next;
    	}
    }
    
    //输出完整链表
    public void print(){
    	RandomListNode node = first;
    	while(node != null){
    		System.out.println(node.label);
    		node = node.next;
    	}
    }
    
    public static void main(String[] args) {
    	RandomList rl = new RandomList();
    	rl.addHead(3);
    	rl.addHead(4);
    	rl.addHead(5);
    	rl.addHead(6);
    	//rl.print(rl.first);
    	System.out.println(rl.findNodeByIndex(2).label);
    	rl.printPart(1);
    	
	} 
}
