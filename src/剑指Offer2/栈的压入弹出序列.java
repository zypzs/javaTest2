package ��ָOffer2;

import java.util.Stack;

public class ջ��ѹ�뵯������ {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack <Integer>stack = new Stack<Integer>();
	        if( pushA.length == 0 || popA.length == 0 ) return false;
	        for( int i=0,j=0; i < pushA.length; i++ ){
	            stack.push( pushA[i] );
	            while( ( !stack.empty() )&& ( stack.peek() == popA[j] ) ){
	                stack.pop();
	                j ++;
	            } 
	        }
	         
	        return stack.empty() == true;
	    }
}
