package sortTest;

public class MergeSort {
	/**
	 * 
	 * 归并排序是稳定的排序方法。
　　       * 归并排序的时间复杂度为O(nlogn)。
         　  *　速度仅次于快速排序，为稳定排序算法，一般用于对总体无序，但是各子项相对有序的数列
	 */
	public static void mergeSort(int []arr){
		if(arr == null || arr.length == 0)
			return ;
		mSort(arr,0,arr.length-1);
	}
	
	private static void mSort(int []arr,int left,int right){
		if(left < right){
			int middle = (left + right)/2;
			mSort(arr,left,middle);
			mSort(arr,middle+1,right);
			merge(arr,left,middle,right);
		}
	}


	/**
     * 合并两个有序数组
     * @param arr 待合并数组
     * @param left 左指针
     * @param mid 中间指针
     * @param right 右指针
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; //中间数组
        
        int i = left;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= right ) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }
        
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while(j <= right) {
            temp[k++] = arr[j++];
        }
        
        for(int p=0; p<temp.length; p++) {
            arr[left + p] = temp[p];
        }
        
    }
}
