package PAT1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test28 {

	/**
	 *PAT 统计同成绩学生
	 */
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
		int num;
		for(int i=0;i<n;i++){
			int temp=input.nextInt();
			if(map1.containsKey(temp)){
				num=map1.get(temp)+1;
				map1.put(temp,num);
			}else
				map1.put(temp, 1);
		}
		 List arrlist=new ArrayList<Integer>();
	        int M=input.nextInt();
	        for(int i=1;i<=M;i++){
	            int temp=input.nextInt();
	            if(map1.containsKey(temp)){
	                arrlist.add(map1.get(temp));
	            }else{
	                arrlist.add(0);
	            }
	        }
	        int i;
	        for(i=0;i<arrlist.size()-1;i++){
	            System.out.print(arrlist.get(i)+" ");
	        }
	        System.out.print(arrlist.get(i));
	    }*/  //老是出现runtime error！！！
	public static void main(String[] args){
        int[] arr=new int[101];
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            arr[input.nextInt()]++;
        }
        int n1=input.nextInt();
        for(int i=0;i<n1-1;i++){
            int temp=input.nextInt();
            System.out.print(arr[temp]+" ");
        }
        System.out.println(arr[input.nextInt()]);
        input.close();
    }
}
