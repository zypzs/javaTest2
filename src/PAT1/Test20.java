package PAT1;

import java.util.Arrays;
import java.util.Scanner;

public class Test20 {

	/**
	 * PAT 完美数列
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int p=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		//使用下面这种方法运行超时了！！！
		/* int res=0;
		  for(int i=n-1;i>=0;i--){
			if(res>=i-1)
				break;
			for(int j=0;j<i;j++){
				if(arr[j]*p<arr[i])
					continue;
				else{
					if(res<i-j)
					res=i-j+1;
					break;
				}
			}
		}*/
		int max=1;
		for(int i=0;i<n-max;++i){
            for(int j=i+max;j<n;++j){//确定max之后的任务就是找到比现有max更大的序列，因此从j=i+max开始找，缩短迭代时间
                if(arr[i]*p<arr[j])
                    break;
                else
                    max = Math.max(max, j-i+1);
            }
        }
      System.out.println(max);
	}

}
