package sortTest;

public class SelectionSort {
     /*
      * ѡ������
      * ��С��������
      * ʱ�临�Ӷ�O(n*n)
      */
/*----------------------------ѡ������------------------------------------------- 
    ��Ҫ����Ķ�����������ݣ�һ����������ģ�һ����δ����ģ��Ӻ��δ���򲿷�ѡ��һ����Сֵ��������ǰ�������򲿷ݵ����һ���� 
-------------------------------------------------------------------------------*/  
	 public static int[] selectionSort(int[] arr) {
	    if(arr == null || arr.length == 0)
	    	return null;
	    int minIndex = 0;//
	    for(int i = 0; i < arr.length-1; i++){
	    	minIndex = i;
	    	for(int j = i; j < arr.length; j++){
	    		if(arr[j] < arr[minIndex]){
	    			minIndex = j;
	    		}
	    	}
	    	//ÿ�ν����Ķ�����С�ģ������ð�����򣬼����˽�������
	    	if(minIndex != i){
	    		swap(arr,i,minIndex);
	    	}
	    }
	    return arr;
	 }
	 
	 private static void swap(int[] arr, int i, int minIndex) {
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
}

	
