package ��ָOffer2;

import java.util.ArrayList;

public class ��С��K���� {
	 public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	        
	        ArrayList<Integer> res = new ArrayList<Integer>();
	        if(input == null || k > input.length)
	            return res;
	        for(int i=0; i < k; i++){
	            int length = input.length;
				bulidMaxHeap(input,length-1-i);
				swap(input,0,length-1-i);
	            res.add(input[length-1-i]);
			}
	        return res;
	    }

		 //�������0��lastIndex���󶥶�
		private static void bulidMaxHeap(int[] arr, int lastIndex) {
			 //��lastIndex���ڵ㣨���һ���ڵ㣩�ĸ��ڵ㿪ʼ 
			for(int i=(lastIndex-1)/2; i>=0; i--){
				int k = i;     //k���������жϵĽڵ� 
				//�����ǰk�ڵ���ӽڵ����
				while(k*2+1 <= lastIndex){
					//k�ڵ�����ӽڵ������
					int biggerIndex = 2*k+1;
					//���biggerIndexС��lastIndex����biggerIndex+1�����k�ڵ�����ӽڵ����
					if(biggerIndex < lastIndex){
						if(arr[biggerIndex] > arr[biggerIndex+1]){
							biggerIndex++;
						}
					}
					//���k�ڵ��ֵС����ϴ���ӽڵ��ֵ
					if(arr[k] > arr[biggerIndex]){
						swap(arr,k,biggerIndex);
						k = biggerIndex;
					}else{
						break;
					}
				}
			}
		}
		
		private static void swap(int[] arr, int k, int biggerIndex) {

			int temp = arr[k];
			arr[k] = arr[biggerIndex];
			arr[biggerIndex] = temp;
		}
}
