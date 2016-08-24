package sortTest;

public class HeapSort {
/**************************************
 * ���������ͨ�����νṹ���沿�ֱȽϽ�����ɼ��ٱȽϴ�����
*����������ʱ�临�Ӷ�ΪO(nlogn)�������ƽ�����ܽϽӽ�������ܡ�
* ���ڽ���ʼ������ıȽϴ����϶࣬���Զ����������ڼ�¼�����ٵ��ļ���
*****************************************/
	public static void heapSort(int [] arr){
		int length = arr.length;
		for(int i=0; i < length-1; i++){
			bulidMaxHeap(arr,length-1-i);
			swap(arr,0,length-1-i);
		}
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
					if(arr[biggerIndex] < arr[biggerIndex+1]){
						biggerIndex++;
					}
				}
				//���k�ڵ��ֵС����ϴ���ӽڵ��ֵ
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
