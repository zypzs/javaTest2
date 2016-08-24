package PAT1;

import java.util.Scanner;

public class Test29 {

	/**
	 * PAT µ½µ×Âò²»Âò
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char []arr1=input.next().toCharArray();
		char []arr2=input.next().toCharArray();
		boolean flag[]=new boolean[arr1.length];
		int num=0,num1=arr1.length;
		for(int i=0;i<arr2.length;i++){
			int j=0;
			while(j<arr1.length){
				if(!flag[j]&&arr1[j]==arr2[i]){
					num++;
					num1--;
					flag[j]=true;
					break;
				}else{
					j++;
				}
					
			}
		}
		
		if(num<arr2.length){
			System.out.println("No "+(arr2.length-num));
		}else{
			System.out.println("Yes "+num1);
		}

	}

}
