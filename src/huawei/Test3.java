package huawei;

import java.util.Scanner;

public class Test3 {
/**
 * ��ֹת����16����ת��10����
 * ͨ���ַ�����ȡ�ӵڶ�λ��ʼ
 * @param args
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		String str=null;
        String str1=null;
        while(input.hasNext()){
           str=input.next();
		   str1=str.substring(2);
         System.out.println(Integer.parseInt(str1, 16));    
        }			
  	}
}