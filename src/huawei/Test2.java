package huawei;

import java.util.Iterator;  
import java.util.Scanner;  
import java.util.TreeSet;   
  
public class Test2 {   
	/**
	 * 随机数的去重和排序
	 * 利用TreeSet
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
            //返回在此 set 中的元素上按升序进行迭代的迭代器。
            Iterator<Integer> it = tSet.iterator();  
            while (it.hasNext())  
            {  
                System.out.println(it.next());  
            }  
        }  
    }  
}  
