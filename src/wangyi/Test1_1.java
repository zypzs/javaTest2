package wangyi;

import java.util.Scanner;
public class Test1_1 {

	private static int gcd(int a,int b)
	 {
	  if(a%b==0)
	   return b;
	  else
	   return gcd(b,a%b);
	 }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,res,temp;
		while(input.hasNext()){
			num = input.nextInt();
			res = input.nextInt();
			for(int i=0; i<num;i++){
				temp = input.nextInt();
				if(temp > res)
					res += gcd(temp,res);
				else
					res += temp;
			}
			System.out.println(res);
		}
	}
}
