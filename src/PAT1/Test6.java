package PAT1;

import java.util.Scanner;

/**
 * 
 * PAT²¿·ÖA+B
 * @author Administrator
 *
 */

public class Test6 {

	public static void main(String[] args)
    {
    long A,DA,B,DB;
    Scanner input = new Scanner(System.in);
    while(input.hasNext())
        {
        A = input.nextLong();
        DA = input.nextLong();
        B = input.nextLong();
        DB = input.nextLong();
        long PA,PB;
        PA = operate(A,DA);
        PB = operate(B,DB);
        System.out.println(PA+PB);
    }
}
	 public static long operate(long A,long DA)
     {
     long sum = 0;
     while(A!=0)
         {
         if(A%10==DA)
             sum=sum*10+DA;
         A/=10;
     }
     return sum;
 }
   
 }
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		String str3=input.next();
		String str4=input.next();
		long result=Long.valueOf(operate(str1,str2))+Long.valueOf(operate(str3,str4));
        System.out.println(result);
	}

	private static String operate(String s1, String s2) {
		String str="";
		while(s1.indexOf(s2)!=-1){
			str+=s2;
			if(s1.length()>1)
			s1=s1.substring(s1.indexOf(s2)+1);
			else
				break;
		}
		return str;
	}*/

