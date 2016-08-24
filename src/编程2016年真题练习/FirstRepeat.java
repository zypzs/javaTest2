package 编程2016年真题练习;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeat {

	 public char findFirstRepeat(String A, int n) {
	        // write code here
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        char []chars = A.toCharArray();
	        for(int i = 0;i < chars.length;i++){
	            if(map.containsKey(chars[i])){
	            	return chars[map.get(chars[i])];
	            }else{
	            	map.put(chars[i], i);
	            }
	        }
	        return  0;
	    }
}
