package huawei;

import java.util.Iterator;  
import java.util.Scanner;  
import java.util.TreeSet;   
  
public class Test2 {   
	/**
	 * �������ȥ�غ�����
	 * ����TreeSet
	 * @param args
	 */
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);  
        while (scan.hasNext())  
        {  
            int num = scan.nextInt();  
            TreeSet<Integer> tSet = new TreeSet<Integer>();  
            for (int i=0;i<num;i++)  
            {  
                tSet.add(scan.nextInt());  
            }  
            //�����ڴ� set �е�Ԫ���ϰ�������е����ĵ�������
            Iterator<Integer> it = tSet.iterator();  
            while (it.hasNext())  
            {  
                System.out.println(it.next());  
            }  
        }  
    }  
}  
