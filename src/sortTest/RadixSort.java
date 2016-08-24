package sortTest;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
	/**
	 * 基数排序算法实现
	 * @param arr
	 */
	public static void radixSort(int []arr){
		//寻找最大数，并计算位数
		int max = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		int times = 0;
		while(max > 0){
			max /= 10;
			times++;
		}
		
		List<ArrayList> queue = new ArrayList<ArrayList>();
		for(int i = 0; i<10; i++){
			ArrayList queue1 = new ArrayList();
			queue.add(queue1);
		}
		
		//进行times次的收集和分配
		for(int i=0; i<times; i++){
			//分配
			for(int j=0; j<arr.length; j++){
				int x = arr[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10,i);
				ArrayList queue2 = queue.get(x);
				queue2.add(arr[j]);
				queue.set(x, queue2);
			}
			//收集
			int count = 0;
			for(int j=0; j<10; j++){
				while(queue.get(j).size() > 0){
					ArrayList<Integer> queue3 = queue.get(j);
					arr[count] = queue3.get(0);
					queue3.remove(0);  //利用remove函数的性质，删除第一个位置的元素后其他的元素自动前移一位
					count++;
				}
			}
		}
	}

}
