package 华为机试;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class 删除出现次数最少的字符 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.next();
			int []num = new int[26];
			char []line = str.toCharArray();
			for(char c : line){
				num[c - 'a']++;
			}
			int minNum = 1;
			for(int i = 0;i < 26;i++){
				if(num[i] != 0 && minNum > num[i]){
					minNum = num[i];
				}
			}
		
			Set <Character> set = new HashSet<Character> ();
			for(int i = 0;i < 26;i++){
				if(num[i] == minNum ){
					set.add((char) (i + 'a'));
				}
			}
			
			for(char c : line){
				if(set.contains(c)){
					continue;
				}else{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}

}
