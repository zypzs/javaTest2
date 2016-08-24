package 剑指Offer2;

import java.util.HashMap;
import java.util.Map;

public class 第一个只出现一次的字符 {
	 public int FirstNotRepeatingChar(String str) {
	     Map<Character,Integer> map = new HashMap<Character,Integer>();  
	        if(str == null || str.length() == 0)
	            return -1;
		     boolean []flg = new boolean[52];
		     char []chars = str.toCharArray();
		        for(int i=0; i<chars.length;i++){
	                int m = Character.isLowerCase(chars[i]) ? (chars[i]-'a'+26) : (chars[i]-'A');
		            if(!flg[m] && map.get(chars[i]) != null){
		            	flg[m] = true;
		            }else{
		            	map.put(chars[i], 1);
		            }
		        }
		        for(int i=0;i<chars.length;i++){
	                int m = Character.isLowerCase(chars[i]) ? (chars[i]-'a'+26) : (chars[i]-'A');
		        	if(!flg[m]){
		        		return i;
		        	}
		        }
		        return -1;
	    }
}
