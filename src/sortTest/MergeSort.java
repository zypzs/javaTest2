package sortTest;

public class MergeSort {
	/**
	 * 
	 * �鲢�������ȶ������򷽷���
����       * �鲢�����ʱ�临�Ӷ�ΪO(nlogn)��
         ��  *���ٶȽ����ڿ�������Ϊ�ȶ������㷨��һ�����ڶ��������򣬵��Ǹ�����������������
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
     * �ϲ�������������
     * @param arr ���ϲ�����
     * @param left ��ָ��
     * @param mid �м�ָ��
     * @param right ��ָ��
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; //�м�����
        
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
