package sortTest;

public class ShakerSort {
	/*---------------------Shake���򷨣�������ð�����򷨣�-------------------------- 
    �������������������˫����У��������������������ҽ��У�������������������������У� 
    ������һ������Ķ�������������ʹ��left��right�����������¼���������������Ԫ��λ�á�  
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
