package sortTest;

import java.util.Arrays;

public class CountSort {
	/**
	 * ��������Ļ���˼���Ƕ��ڸ��������������е�ÿһ��Ԫ��x��
	 * ȷ����������ֵС��x��Ԫ�صĸ������˴����ǱȽϸ�Ԫ�صĴ�С��
	 * ����ͨ����Ԫ��ֵ�ļ����ͼ���ֵ���ۼ���ȷ������
	 * һ�����������Ϣ���Ϳ��Խ�xֱ�Ӵ�ŵ����յ�������е���ȷλ����
	 */
	public static void countSort(int []arr){
		int []res = new int[arr.length];
		int min = arr[0],max = arr[0];
		//���ҵ������е����ֵ����Сֵ
		for(int i :arr){
			if(i > max)
				max = i;
			if(i < min)
				min = i;
		}
		
		//����k�Ĵ�С��Ҫ����������У�Ԫ�ش�С�ļ�ֵ��+1
        int k=max-min+1;
        int c[]=new int[k];
        for(int i=0;i<arr.length;++i){
            c[arr[i]-min]+=1;//�Ż����ĵط�����С������c�Ĵ�С
        }
        //����С������ʼ��������������������е�λ��
        for(int i=1;i<c.length;++i){
            c[i]=c[i]+c[i-1];
        }
        for(int i=arr.length-1;i>=0;--i){
            res[--c[arr[i]-min]]=arr[i];//����ȡ�ķ�ʽȡ��c��Ԫ��
        }
        
        //�����������ص�ԭʼ����
        int j = 0;
        for(int i : res){
        	arr[j++] = i;
        }
	}

}
