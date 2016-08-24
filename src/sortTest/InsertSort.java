package sortTest;

public class InsertSort {
	/**
	 * ��������
	 * ʱ�临�Ӷ�O(n*n)
	 * @param arr
	 */
	public static void insertSort(int [] arr){
		if(arr == null || arr.length == 0)
			return ;
		for(int i=1; i<arr.length; i++){
			int temp = arr[i];//ȡ��i��Ԫ�ز���ǰi-1��Ԫ����
//			int j=i;
//			for(;j>0;j--){
//				if(temp >= arr[j-1]){
//					break;
//				}
//				else{
//					arr[j] = arr[j-1];
//				}
//			}
			
			//�������ֱ�����ʽ��ֱ��Щ
			int j=i-1;
			while(j >= 0 && temp < arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

}
