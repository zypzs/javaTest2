package stackTest;

import java.util.Stack;

public class StackReverse {
	public static int getAndRemoveLastElement(Stack<Integer> stack){
		int result=stack.pop();
		if(stack.isEmpty()){
			return result;
		}else{
			int last=getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	public static void reverse(Stack<Integer> stack){
		if(stack.isEmpty()){
			return ;
		}
		int i=getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
	    reverse(s);
		System.out.println(s.pop()+""+s.pop()+""+s.pop());
	}

}
