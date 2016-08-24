package stackTest;

import java.util.Stack;

public class stackSort {
	public static void sortStackByStack(Stack<Integer> stack){
		Stack<Integer> help=new Stack<Integer>();
		while(!stack.isEmpty()){
			int cur=stack.pop();
			while(!help.isEmpty() && help.peek()<cur){
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while(!help.isEmpty()){
			stack.push(help.pop());
		}
	}
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(3);
		s.push(6);
		s.push(4);
		s.push(2);
		sortStackByStack(s);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}

}
