package sortTest;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
	/**
	 * ���������㷨ʵ��
	 * @param arr
	 */
	public static void radixSort(int []arr){
		//Ѱ���������������λ��
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
		
		//����times�ε��ռ��ͷ���
		for(int i=0; i<times; i++){
			//����
			for(int j=0; j<arr.length; j++){
				int x = arr[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10,i);
				ArrayList queue2 = queue.get(x);
				queue2.add(arr[j]);
				queue.set(x, queue2);
			}
			//�ռ�
			int count = 0;
			for(int j=0; j<10; j++){
				while(queue.get(j).size() > 0){
					ArrayList<Integer> queue3 = queue.get(j);
					arr[count] = queue3.get(0);
					queue3.remove(0);  //����remove���������ʣ�ɾ����һ��λ�õ�Ԫ�غ�������Ԫ���Զ�ǰ��һλ
					count++;
				}
			}
		}
	}

}
