package PAT1;

import java.util.Scanner;

public class Test14 {

	/**
	 * PAT 科学计数法
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.next();
        operate(str);
	}

	private static void operate(String str) {
		String str1=str.substring(0, str.indexOf("E"));
		String res="",res1="";
		int num=Integer.valueOf(str.substring(str.indexOf("E")+1));
		if(num<0){
			if(str1.charAt(0)=='+')
			    res1="0.";
			else
				res1="-0.";
			while(num+1<0){
				res1+="0";
				num++;
			}
			res=res1+str1.substring(1, 2)+str1.substring(3);
		}
		else if(num==0){
			res=str1;
		}
		else{
			if(str1.length()-3>num){
				res=str1.substring(0, 2)+str1.substring(3, 3+num)+"."+str1.substring(3+num);
			}
			else if(str1.length()-3==num)
				res=str1.substring(0, 2)+str1.substring(3);
			else{
				res1="";
				while(num-(str1.length()-3)>0){
					num--;
					res1+="0";
				}
				res=str1.substring(0, 2)+str1.substring(3)+res1;
			}
			if(res.charAt(0)=='+')
				res=res.substring(1);
		}
		System.out.println(res);
	}

}
