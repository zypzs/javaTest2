package PAT1;

import java.util.Scanner;

public class Test12 {

	/**
	 * PAT D���Ƶ�A+B
	 */
	/*public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num1=input.nextInt();
	int num2=input.nextInt();
	int n=input.nextInt();
	operate(num1+num2,n);		
	}

	private static void operate(int i, int n) {
		String result="";
			while(i>n){
				result+=i%n;
				i=i/n;
			}
			result+=i;
	StringBuffer buffer = new StringBuffer(result);
	System.out.println(buffer.reverse());
	}*/
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int n=input.nextInt();
	 String str = Integer.toString(num1+num2, n);//�����õڶ�������ָ��������ʾ�ĵ�һ���������ַ�����ʾ��ʽ��
     System.out.println(str);
	}
}
