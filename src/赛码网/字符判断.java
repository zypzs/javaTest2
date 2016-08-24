package ÈüÂëÍø;

import java.util.*;
public class ×Ö·ûÅĞ¶Ï {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		while(scan.hasNext()){
			char []str1 = scan.next().toCharArray();
			char []str2 = scan.next().toCharArray();
			for(char c : str1){
				if(map.get(c) != null){
					map.put(c, map.get(c)+1);
				}else{
					map.put(c, 1);
				}
			}
			int res = 1;
			for(char c : str2){
				if(map.get(c) != null){
					map.put(c, map.get(c)-1);
				}else{
					res = 0;
					break;
				}
			}
			System.out.println(res);
		}
	}
	
}
