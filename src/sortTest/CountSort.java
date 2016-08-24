package sortTest;

import java.util.Arrays;

public class CountSort {
	/**
	 * 计数排序的基本思想是对于给定的输入序列中的每一个元素x，
	 * 确定该序列中值小于x的元素的个数（此处并非比较各元素的大小，
	 * 而是通过对元素值的计数和计数值的累加来确定）。
	 * 一旦有了这个信息，就可以将x直接存放到最终的输出序列的正确位置上
	 */
	public static void countSort(int []arr){
		int []res = new int[arr.length];
		int min = arr[0],max = arr[0];
		//先找到数组中的最大值和最小值
		for(int i :arr){
			if(i > max)
				max = i;
			if(i < min)
				min = i;
		}
		
		//这里k的大小是要排序的数组中，元素大小的极值差+1
        int k=max-min+1;
        int c[]=new int[k];
        for(int i=0;i<arr.length;++i){
            c[arr[i]-min]+=1;//优化过的地方，减小了数组c的大小
        }
        //从最小的数开始计数，计算该数在数组中的位置
        for(int i=1;i<c.length;++i){
            c[i]=c[i]+c[i-1];
        }
        for(int i=arr.length-1;i>=0;--i){
            res[--c[arr[i]-min]]=arr[i];//按存取的方式取出c的元素
        }
        
        //把排序结果返回到原始数组
        int j = 0;
        for(int i : res){
        	arr[j++] = i;
        }
	}

}
