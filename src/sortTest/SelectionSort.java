package sortTest;

public class SelectionSort {
     /*
      * 选择排序：
      * 从小到大排列
      * 时间复杂度O(n*n)
      */
/*----------------------------选择排序法------------------------------------------- 
    将要排序的对象分作两部份，一个是已排序的，一个是未排序的，从后端未排序部份选择一个最小值，并放入前端已排序部份的最后一个。 
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
	    	//每次交换的都是最小的，相比于冒泡排序，减少了交换次数
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

	
