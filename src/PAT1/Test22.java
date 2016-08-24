package PAT1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test22 {

	/**
	 * PAT 挖掘机技术哪家强
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
		int num=0,score=0;
		for(int i=0;i<n;i++){
			num=input.nextInt();
			score=input.nextInt();
			if(map1.get(num)!=null)
			score=score+map1.get(num);
			map1.put(num, score);			
		}
       int key=0,value=0;
        Iterator ite =  map1.entrySet().iterator();  //使用entrySet遍历，效率高
		while(ite.hasNext()){
			Map.Entry entry = (Map.Entry) ite.next();
			if((int)entry.getValue()>value){
				key = (int) entry.getKey();
				value = (int) entry.getValue();
			}			 
		
		}
		 System.out.println(key+" "+value);
	}

}
