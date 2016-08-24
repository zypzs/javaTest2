package sortTest;

public class HeapSort {
/**************************************
 * 　堆排序可通过树形结构保存部分比较结果，可减少比较次数。
*　堆排序的最坏时间复杂度为O(nlogn)。堆序的平均性能较接近于最坏性能。
* 由于建初始堆所需的比较次数较多，所以堆排序不适宜于记录数较少的文件。
*****************************************/
	public static void heapSort(int [] arr){
		int length = arr.length;
		for(int i=0; i < length-1; i++){
			bulidMaxHeap(arr,length-1-i);
			swap(arr,0,length-1-i);
		}
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
					if(arr[biggerIndex] < arr[biggerIndex+1]){
						biggerIndex++;
					}
				}
				//如果k节点的值小于其较大的子节点的值
				if(arr[k] < arr[biggerIndex]){
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
	
	
	
	public static void heapSort1(int arr[]){
		buildMaxHeap1(arr);
		int length = arr.length-1;
		int s,p;
		while(length >= 1){
			swap(arr,0,length);
			length--;
			p = 0;
			s = 2*p+1;
			while(s <= length){
				if(s < length && arr[s] < arr[s+1]){
					s++;
				}
				if(arr[p] >= arr[s])
					break;
				swap(arr,s,p);
				p = s;
				s = 2*p+1;
			}
		}
	}

	private static void buildMaxHeap1(int arr[]){
		int s,p;
		for(int i=arr.length-1; i>0; i--){
			s = i;
			p = (i-1)/2;
			while(s >= 1 && arr[p] < arr[s]) {  
	               swap(arr,s,p);  
	               s = p;  
	               p = s / 2;  
	           }  
		}
	}
	
}
