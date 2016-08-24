package sortTest;

public class QuickSort {
	
	/**
	 * 快速排序是不稳定的排序。
       　　*    快速排序的时间复杂度为O(nlogn)。
　　      * 当n较大时使用快排比较好，当序列基本有序时用快排反而不好
	 */
	public static void quickSort(int []arr){
		if(arr == null || arr.length == 0)
			return ;
		quick_sort(arr,0,arr.length-1);
	}

	private static void quick_sort(int[] arr, int low, int high) {

		if(low<high){ //递归终止条件
            int middle = getMiddle(arr,low,high);
            quick_sort(arr, 0, middle-1);
            quick_sort(arr, middle+1, high);
        }
		
	}

	private static int getMiddle(int[] arr, int low, int high) {
		int temp = arr[low];//基准元素
        while(low<high){
            //找到比基准元素小的元素位置
            while(low<high && arr[high]>=temp){
                high--;
            }
            arr[low] = arr[high]; 
            while(low<high && arr[low]<=temp){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
	
	public static void main(String[] args) {
		int []arr = {1332802,1177178,1514891,871248,753214,123866,1615405,
				328656,1540395,968891,1884022,252932,1034406,1455178,821713,
				486232,860175,1896237,852300,566715,1285209,1845742,883142,
				259266,520911,1844960,218188,1528217,332380,261485,1111670,
				16920,1249664,1199799,1959818,1546744,1904944,51047,1176397,
				190970,48715,349690,673887,1648782,1010556,1165786,937247,
				986578,798663};
		
		quickSort(arr);
		Client.printArray(arr);
	}
}
