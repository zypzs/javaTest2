package PAT1;

import java.util.Scanner;

public class Test27 {

	/**
	 * PAT¡¡¡¡ÔÚ»ô¸ñÎÖ´ÄÕÒÁãÇ®
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1=input.next();
		String s2=input.next();
		operate(s1,s2);

	}

	private static void operate(String s1, String s2) {
		int arr1[]=change(s1);
		int arr2[]=change(s2);
		if(compare(arr1,arr2))
			com(arr1,arr2);
		else{
			System.out.print("-");
			com(arr2,arr1);
		}
		
	}

	private static void com(int[] arr1, int[] arr2) {
		arr2[2]-=arr1[2];
		if(arr2[2]<0){
			arr2[2]+=29;
			arr2[1]--;
		}
		arr2[1]-=arr1[1];
		if(arr2[1]<0){
			arr2[1]+=17;
			arr2[0]--;
		}
		arr2[0]-=arr1[0];
		System.out.println(arr2[0]+"."+arr2[1]+"."+arr2[2]);
		
	}

	private static boolean compare(int[] arr1, int[] arr2) {
		if(arr1[0]>arr2[0]||(arr1[0]==arr2[0]&&arr1[1]>arr2[1])||(arr1[0]==arr2[0]&&arr1[1]==arr2[1]&&arr1[2]>arr2[2]))
				return false;
		else
			return true;
		
	}

	private static int [] change(String s) {
		String s1[]=s.split("\\.");
		int r[]=new int[3];
		r[0]=Integer.valueOf(s1[0]);
		r[1]=Integer.valueOf(s1[1]);
		r[2]=Integer.valueOf(s1[2]);
		return r;
	}

}
