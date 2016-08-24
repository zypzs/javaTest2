package huawei;

import java.util.Scanner;

public class Test3 {
/**
 * 禁止转换，16进制转换10进制
 * 通过字符串截取从第二位开始
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