package sortTest;

public class InsertSort {
	/**
	 * 插入排序
	 * 时间复杂度O(n*n)
	 * @param arr
	 */
	public static void insertSort(int [] arr){
		if(arr == null || arr.length == 0)
			return ;
		for(int i=1; i<arr.length; i++){
			int temp = arr[i];//取第i个元素插入前i-1个元素中
//			int j=i;
//			for(;j>0;j--){
//				if(temp >= arr[j-1]){
//					break;
//				}
//				else{
//					arr[j] = arr[j-1];
//				}
//			}
			
			//下面这种表述方式更直观些
			int j=i-1;
			while(j >= 0 && temp < arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

}
