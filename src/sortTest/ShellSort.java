package sortTest;

public class ShellSort {

	/*--------------------------shell��ϣ��������---------------------------- 
    Shell���Ƚ�����趨Ϊn/2��Ȼ����Ծ���в����������������n/4����Ծ���������������� 
    ����趨Ϊn/8��n/16��ֱ�����Ϊ1֮������һ��������ֹ��������һ�ε����������Ὣ 
    �̶�����ڵ�Ԫ������ã����Ե����Խ��ԽСʱ��ĳЩԪ��λ����ȷλ�õĻ���Խ�ߣ���� 
    ��󼸴ε������������Դ�����͡� 
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
