package 剑指Offer通过的代码;

import java.util.Stack;

public class 调整数组顺序使奇数位于偶数前面 {
	public void reOrderArray(int [] array) {
	      Stack <Integer> stack1=new Stack<Integer>();
	    	 Stack <Integer> stack2=new Stack<Integer>();
	    	 for (int i=0;i<array.length;i++) {
				if(array[i]%2==0){
					stack1.push(array[i]);
				}else{
					stack2.push(array[i]);
				}
			}
	    	 int i=array.length-1;
	    	 while(!stack1.isEmpty()){
	    		 array[i]=stack1.pop();
	    		 i--;
	    	 }
	    	 while(!stack2.isEmpty()){
	    		 array[i]=stack2.pop();
	    		 i--;
	    	 }     
	    }
}
