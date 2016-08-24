package ����Ա����ָ��;

import java.util.*;

public class �������ڵ����ֵ {
	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
		ArrayList<Integer> list = new ArrayList();
		if(num == null || num.length < 1 || size < 1){
			return list;
		}
        Deque <Integer>queue = new LinkedList();
        for(int i=0;i<num.length;i++){
        	while(!queue.isEmpty() && num[queue.peekLast()] <= num[i]){
        		queue.pollLast();
        	}
        	queue.addLast(i);
        	if(queue.peekFirst() == i-size){
        		queue.pollFirst();
        	}
        	if(i >= size-1){
        		list.add(num[queue.peekFirst()]);
        	}
        }
        return list;
    }

}
