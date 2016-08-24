package PAT1;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test11 {
    public static void main(String []args){
    	Scanner input=new Scanner(System.in);
    	char arr[]=input.next().toCharArray();
    	int result[]=new int[10];
    	for(int i=0;i<arr.length;i++){
    		result[arr[i]-'0']++;
    	}
    	for(int i=0;i<10;i++){
    		if(result[i]!=0){
    			System.out.println(i+":"+result[i]);
    		}
    	}
    	/**
    	 * 这种方法比较耗时间
    	 * 
    	 */
    	/*Arrays.sort(arr);
    	char temp=arr[0];
    	int num=0;
    	Map <Character,Integer> map1=new TreeMap<Character,Integer>();
    	for(int i=0;;i++){
    		if(i>=arr.length){
    			map1.put(temp, num);
    			break;
    		}
    		if(arr[i]==temp){
    			num++;
    		}else{
    			map1.put(temp, num);
    			num=1;
    			temp=arr[i];
    		}    		
    	}
    	//TreeMap默认升序排列
    	for (Map.Entry<Character, Integer> entry : map1.entrySet()) {      		  
    	    System.out.println(entry.getKey() + ":" + entry.getValue());      	  
    	}  */
    }
}
