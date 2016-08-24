package 剑指Offer2;

import java.util.ArrayList;

public class 最小的K个数 {
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

		 //对数组从0到lastIndex建大顶堆
		private static void bulidMaxHeap(int[] arr, int lastIndex) {
			 //从lastIndex处节点（最后一个节点）的父节点开始 
			for(int i=(lastIndex-1)/2; i>=0; i--){
				int k = i;     //k保存正在判断的节点 
				//如果当前k节点的子节点存在
				while(k*2+1 <= lastIndex){
					//k节点的左子节点的索引
					int biggerIndex = 2*k+1;
					//如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
					if(biggerIndex < lastIndex){
						if(arr[biggerIndex] > arr[biggerIndex+1]){
							biggerIndex++;
						}
					}
					//如果k节点的值小于其较大的子节点的值
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
