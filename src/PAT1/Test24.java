package PAT1;

import java.util.Scanner;

public class Test24 {

	/**
	 * PAT   有理数四则运�?
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1[]=input.next().split("/");
		String s2[]=input.next().split("/");
		
		add(s1,s2);
		sub(s1,s2);
		mul(s1,s2);
		div(s1,s2);
	}

	
	private static void change(String[] s1) {
		int a,b;
		boolean flag=false;
		a=Integer.valueOf(s1[0]);
		b=Integer.valueOf(s1[1]);
		if(a<0){
			System.out.print("(-");
			flag=true;
			a=-a;
		}
		if(a==0){
			System.out.print(0);
		}else{
			if(a<b)
			System.out.print(a/getMaxDivsior(a,b)+"/"+b/getMaxDivsior(a,b));
			else if(a%b==0)
				System.out.print(a/b);
			else
				System.out.print(a/b+" "+(a%b)/getMaxDivsior(a%b,b)+"/"+b/getMaxDivsior(a%b,b));
		}
		
		if(flag){
			System.out.print(")");
		}
	}

	private static void add(String[] s1, String[] s2) {
		change(s1);
		System.out.print(" + ");
		change(s2);
        int n1,n2,n3,n4;
        int res1,res2;
        String s[]={"",""};
		n1=Integer.valueOf(s1[0]);
		n2=Integer.valueOf(s1[1]);
		n3=Integer.valueOf(s2[0]);
		n4=Integer.valueOf(s2[1]);
		res1=n1*n4+n2*n3;
		res2=n2*n4;
		s[0]+=res1;
		s[1]+=res2;
		System.out.print(" = ");
		change(s);
		System.out.println();
	}
	
	private static void sub(String[] s1, String[] s2) {
		change(s1);
		System.out.print(" - ");
		change(s2);
        int n1,n2,n3,n4;
        int res1,res2;
        String s[]={"",""};
		n1=Integer.valueOf(s1[0]);
		n2=Integer.valueOf(s1[1]);
		n3=Integer.valueOf(s2[0]);
		n4=Integer.valueOf(s2[1]);
		res1=n1*n4-n2*n3;
		res2=n2*n4;
		s[0]+=res1;
		s[1]+=res2;
		System.out.print(" = ");
		change(s);
		System.out.println();
		
	}
	
	private static void mul(String[] s1, String[] s2) {
		change(s1);
		System.out.print(" * ");
		change(s2);
        int n1,n2,n3,n4;
        int res1,res2;
        String s[]={"",""};
		n1=Integer.valueOf(s1[0]);
		n2=Integer.valueOf(s1[1]);
		n3=Integer.valueOf(s2[0]);
		n4=Integer.valueOf(s2[1]);
		res1=n1*n3;
		res2=n2*n4;
		s[0]+=res1;
		s[1]+=res2;
		System.out.print(" = ");
		change(s);
		System.out.println();
		
	}

	private static void div(String[] s1, String[] s2) {
		change(s1);
		System.out.print(" / ");
		change(s2);
        int n1,n2,n3,n4;
        int res1,res2;
        String s[]={"",""};
		n1=Integer.valueOf(s1[0]);
		n2=Integer.valueOf(s1[1]);
		n3=Integer.valueOf(s2[0]);
		if(n3==0){
			System.out.print(" = ");
			System.out.println("Inf");
			return;
		}
		n4=Integer.valueOf(s2[1]);
		res1=n1*n4;
		res2=n2*n3;
		if(res2<0){
			res2=-res2;
			res1=-res1;
		}
		s[0]+=res1;
		s[1]+=res2;
		System.out.print(" = ");
		change(s);
		System.out.println();
		
	}
	/** 
	  * 求a和b的最大公约数   */
	public static int getMaxDivsior(int m,int n)  
    {  
		int temp=0;
		while(m!=0){
			temp=n%m;
			n=m;
			m=temp;
		}
        return n;  
    }  

}
