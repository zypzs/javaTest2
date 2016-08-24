package sortTest;

public class ShellSort {

	/*--------------------------shell（希尔）排序法---------------------------- 
    Shell首先将间隔设定为n/2，然后跳跃进行插入排序，再来将间隔n/4，跳跃进行排序动作，再来 
    间隔设定为n/8、n/16，直到间隔为1之后的最后一次排序终止，由于上一次的排序动作都会将 
    固定间隔内的元素排序好，所以当间隔越来越小时，某些元素位于正确位置的机率越高，因此 
    最后几次的排序动作将可以大幅减低。 
    ---------------------------------------------------------------------*/
	public static void shellSort(int []arr){
		if(arr == null || arr.length == 0)
			return ;
		int d = arr.length/2;   
		while(d >= 1){
			shellInsert(arr,d);
			d /= 2;
		}
	}

	private static void shellInsert(int[] arr, int d) {

		for(int i = d; i < arr.length; i++){
			int j = i-d;
			int temp = arr[i];
			while(j >= 0 && arr[j]>temp){
				arr[j+d] = arr[j];
				j -= d;
			}
			if(j != i-d)
				arr[j+d] = temp;
		}
	}
}
