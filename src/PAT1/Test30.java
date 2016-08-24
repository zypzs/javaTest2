package PAT1;

import java.util.Scanner;

public class Test30 {

	/**
	 * PAT  有几个PAT
	 */
	//这种解法运行超时
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char []arr=input.next().toCharArray();
		String pnum="",anum="",tnum="";
		for(int i=0;i<arr.length;i++){
			switch(arr[i]){
			case 'P':
				pnum+=i;
				break;
			case 'A':
				anum+=i;
				break;
			case 'T':
				tnum+=i;
				break;
				default:break;
			}
		}
		int res1[]=new int[anum.length()];
		long res=0;
		for(int i=0;i<anum.length();i++){
			int j=0;
			while(j<tnum.length() && anum.charAt(i)>tnum.charAt(j)){
				j++;
			}
			res1[i]=tnum.length()-j;
	}
		for(int i=0;i<pnum.length();i++){
			for(int j=0;j<anum.length();j++)
			if(pnum.charAt(i)<anum.charAt(j)){
				res+=res1[j];
			}
		}
		System.out.println(res%1000000007);
	}*/

	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		char []arr=input.next().toCharArray();
		long p=0,pa=0,pat=0;
		for(int i=0;i<arr.length;i++){
			switch(arr[i]){
			case 'P':
				p++;
				break;
			case 'A':
				pa+=p;
				break;
			case 'T':
				pat+=pa;
				break;
				default:break;
			}
		}
		System.out.println(pat%1000000007);
	}
}
