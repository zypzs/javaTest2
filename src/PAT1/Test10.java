package PAT1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test10 {

	/**
	 * @PAT 月饼
	 */
	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 int n=input.nextInt();
	 int total=input.nextInt();
	 int arr1[]=new int[n],arr2[]=new int[n];
	 float arr3[]=new float[n];
	 for(int i=0;i<n;i++)
		 arr1[i]=input.nextInt();
	 for(int i=0;i<n;i++){
		 arr2[i]=input.nextInt();
		 arr3[i]=(float)arr2[i]/arr1[i];
	 }
	 int temp=0;
	 float temp1=0;
	 for(int i=0;i<n;i++)
		 for(int j=0;j<i;j++){
			 if(arr3[j]<arr3[i] ||(arr3[j]==arr3[i] && arr1[j]<arr1[i])){
				 temp=arr1[i];
				 arr1[i]=arr1[j];
				 arr1[j]=temp;
				 temp=arr2[i];
				 arr2[i]=arr2[j];
				 arr2[j]=temp;
				 temp1=arr3[i];
				 arr3[i]=arr3[j];
				 arr3[j]=temp1;
			 }
		 }
	 temp=total;
	 temp1=0;
	 for(int i=0;i<n;i++){
		 if(arr1[i]<=temp){
			 temp1+=arr2[i];
			 temp=temp-arr1[i];
		 }
		 else{
			 temp1+=(arr3[i]*temp);
			 break;
		 }
	 }
	 DecimalFormat decimalFormat=new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
	 String p=decimalFormat.format(temp1);//format 返回的是字符串
		System.out.println(p);
	}
}
