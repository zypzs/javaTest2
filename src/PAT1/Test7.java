package PAT1;

import java.util.Scanner;

public class Test7 {

	/**
	 * PAT A³ıÒÔB
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.next();
		int num=input.nextInt();
        String res="";
        int res1=0,y=0;
        int x=str.charAt(0)-'0';
        if(x/num>0)
        	
        	res+=x/num;
        res1=x%num;
        for(int i=1;i<str.length();i++){
        	y=res1*10+(str.charAt(i)-'0');
        	res+=(y/num);
        	res1=(y%num);
        }
        if("".equals(res))
        	System.out.print(0+" "+res1);
        else
        	System.out.println(res+" "+res1);
	}
}
