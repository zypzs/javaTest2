package PAT1;

import java.util.Scanner;

public class Test21 {

	/**
	 * PAT 查验身份证
	 */
	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 int n=input.nextInt();
	 char []m={'1','0','X','9','8','7','6','5','4','3','2'};
	 int []x={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
	 int temp=0;
	 String res="";
	 for(int i=0;i<n;i++){
		 String str=input.next();
		 temp=0;
		 for(int j=0;j<str.length()-1;j++){
			 if(str.charAt(j)-'0'>9)
			 {
				 res=str;
				 System.out.println(res);
				 temp=0;
				 break;
			 }
			 temp+=(str.charAt(j)-'0')*x[j];
		 }
		 if(str.charAt(str.length()-1)!=m[temp%11] && temp!=0){
			 res=str;
			 System.out.println(res);
		 }
	 }
	 if("".equals(res)){
		 System.out.println("All passed");
	 }

	}

}
