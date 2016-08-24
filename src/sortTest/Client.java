package sortTest;

public class Client {

	public static void main(String[] args) {
	    int length = 10;
		int []arr = new int[length];
		for(int i=0; i<length; i++){
			arr[i] = (int)(Math.random()*100);
		}
		long start,end;//用于计算排序所用时间
		System.out.println("------------排序之前的数据-----------");
		printArray(arr);
		start = System.nanoTime();
//		BubbleSort.bubbleSort(arr);
//		SelectionSort.selectionSort(arr);
//		InsertSort.insertSort(arr);
//		ShellSort.shellSort(arr);
//		ShakerSort.shakerSort(arr);
		HeapSort.heapSort(arr);
//		HeapSort.heapSort1(arr);
//		QuickSort.quickSort(arr);
//		MergeSort.mergeSort(arr);
//		RadixSort.radixSort(arr);
//		CountSort.countSort(arr);
		end = System.nanoTime();
		System.out.println("-------------排序之后的数据------------");
		printArray(arr);
		System.out.println("排序所用时间："+(end - start)+"ns");
	}
	
	public static void printArray(int []arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
