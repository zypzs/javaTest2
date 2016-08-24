package test;

import java.util.*;
public class Main{
	
	public static int FirstNotRepeatingChar(String str) {
	     Map<Character,Integer> map = new HashMap<Character,Integer>();  
	     boolean []flg = new boolean[26];
	     char []chars = str.toUpperCase().toCharArray();
	        for(int i=0; i<chars.length;i++){
	            if(map.get(chars[i]) != null){
	            	flg[chars[i]-'A'] = true;
	            }else{
	            	map.put(chars[i], 1);
	            }
	        }
	        for(int i=0;i<chars.length;i++){
	        	if(!flg[chars[i] - 'A']){
	        		return i;
	        	}
	        }
	        return 0;
	    }
	
	 public static String LeftRotateString(String str,int n) {
	        StringBuilder sbu = new StringBuilder(str);
	        for(int i=0;i<n;i++){
	            char c = sbu.charAt(0);
	            sbu.deleteCharAt(0);
	            sbu.append(c);
	        }
	        return sbu.toString();
	    }
    public static void main(String []args){
    	 String s ="ADFSSLJADFLJLKJIL";
    	 System.out.println(FirstNotRepeatingChar(s));
    	 System.out.println(LeftRotateString(s,23));
    }
}
