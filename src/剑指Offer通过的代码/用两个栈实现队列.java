package 剑指Offer通过的代码;

import java.util.Stack;

public class 用两个栈实现队列 {
	 Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	       while(!stack1.isEmpty()){
	        	stack2.push(stack1.pop());
	        }
	        stack1.push(node);
	        while(!stack2.isEmpty()){
	        	stack1.push(stack2.pop());
	        }  
	    }
	    
	    public int pop() {
	       return stack1.pop(); 
	    }
}
