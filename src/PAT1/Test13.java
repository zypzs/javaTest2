package PAT1;

import java.util.Scanner;

public class Test13 {

	/**
	 * PAT组个最小数
	 */
	public static void main(String[] args) {	 
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=input.nextInt();
		}
		String res="",res1="";
		for(int i=1;i<10;i++){
			while(arr[i]!=0){
				res+=i;
				arr[i]--;
			}
		}
		if(arr[0]!=0){
			while(arr[0]!=0)
			{
				res1+="0";
				arr[0]--;
			}
				
			res=res.substring(0, 1)+res1+res.substring(1);
		}
		System.out.println(res);

	}

}
