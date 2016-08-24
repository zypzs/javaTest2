package PAT1;

import java.util.Scanner;

public class Test26 {

	/**
	 * PAT 和奥巴马一起编程
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String s=input.next();
		String s1="",s2="";
		for(int i=0;i<n;i++){
			s1+=s;
			if(i==0||i==n-1)
				s2+=s;
			else
				s2+=" ";
		}
		System.out.println(s1);
		for(int i=1;i<(n+1)/2-1;i++)
			System.out.println(s2);
		System.out.println(s1);

	}

}
