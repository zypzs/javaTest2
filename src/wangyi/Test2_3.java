package wangyi;

public class Test2_3 {
	/**
	 * 利用快速排序思路寻找数组中第K大的数
	 * @param arr
	 * @param n
	 * @param K
	 * @return
	 */
	    public static int findKth(int[] arr, int n, int K) {
	        return quickSort(arr, 0, n - 1, K);
	    }
	 
	    public static int quickSort(int arr[], int low, int high, int k) {
	        if (low == high) {
	            return arr[low];
	        }
	        int pivot = partition(arr, low, high);
	        int kp = pivot - low + 1;//计算pivot是第几大数
	        if (kp == k) {
	            return arr[pivot];
	        }
	        if (k < kp) {
	            return quickSort(arr, low, pivot - 1, k);//递归调用，在前面部分查找第K大的数
	        }else {
	            return quickSort(arr, pivot + 1, high, k - kp);//递归调用，在后面部分查找第K大的数
	        }
	 
	    }
	 
	    public static int partition(int[] arr, int low, int high) {
	        int right = high;
	        int left = low;
	        int temp = arr[left];
	        while (left < right) {
	            while (left < right && arr[right] <= temp) {
	                --right;
	            }
	            if (left < right) {
	                arr[left] = arr[right];
	            }
	            while (left < right && arr[left] >= temp) {
	                ++left;
	            }
	            if (left < right) {
	                arr[right] = arr[left];
	            }
	        }
	        arr[left] = temp;
	        return left;
	    }
	public static void main(String[] args) {
		int []arr = {1332802,1177178,1514891,871248,753214,123866,1615405,
				328656,1540395,968891,1884022,252932,1034406,1455178,821713,
				486232,860175,1896237,852300,566715,1285209,1845742,883142,
				259266,520911,1844960,218188,1528217,332380,261485,1111670,
				16920,1249664,1199799,1959818,1546744,1904944,51047,1176397,
				190970,48715,349690,673887,1648782,1010556,1165786,937247,
				986578,798663};
		System.out.println(findKth(arr,49,24));
	}
}
