package sortTest;

public class ShakerSort {
	/*---------------------Shake排序法（改良的冒泡排序法）-------------------------- 
    方法就在于气泡排序的双向进行，先让气泡排序由左向右进行，再来让气泡排序由右往左进行， 
    如此完成一次排序的动作，而您必须使用left与right两个旗标来记录左右两端已排序的元素位置。  
--------------------------------------------------------------------*/  
	public static void shakerSort(int []arr){
		int left = 0, right = arr.length-1, shift = 0;
		int temp;
		while(left < right){
			for(int i = left; i < right; i++){
				if(arr[i] > arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					shift = i;
				}
			}
			right = shift;
			for(int i = right; i > left; i--){
				if(arr[i] < arr[i-1]){
					temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					shift = i;
				}
			}
			left = shift;
		}
	}

}
