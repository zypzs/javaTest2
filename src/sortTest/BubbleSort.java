package sortTest;


public class BubbleSort {
	/*
	 * 冒泡排序算法
	 * 从小到大排序
	 * 时间复杂度O(n*n)
	 */
	 /*-----------------------------------------冒泡排序法---------------------------------------- 
    顾名思义，就是排序时，最大的元素会如同气泡一样移至右端，其利用比较相邻元素的方法，将大的元素交换至右端， 
所以大的元素会不断的往右移动，直到适当的位置为止。 
   基本的气泡排序法可以利用旗标的方式稍微减少一些比较的时间，当寻访完阵列后都没有发生任何的交换动作， 
表示排序已经完成，而无需再进行之后的回圈比较与交换动作。 
----------------------------------------------------------------------------------------*/  
    public static int[] bubbleSort(int[] arr) {
    	if(arr == null || arr.length == 0)
    		return null;
    	for(int i = 0; i < arr.length - 1; i++){
    		for(int j = arr.length - 1; j > i; j--){
    			if(arr[j-1] > arr[j]){
    				swap(arr,j-1,j);
    			}
    		}
    	}
    	return arr;
    }

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
