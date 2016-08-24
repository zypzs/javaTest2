package 华为机试;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class 字符串加密 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String word = scan.next();
			char []pass = getPass(word);
			char []chars = scan.next().toCharArray();
			for(int i =0;i<chars.length;i++){
				if(chars[i] >= 'A' && chars[i] <= 'Z'){
					chars[i] = pass[chars[i] - 'A'];
				}else{
					chars[i] = (char) (pass[chars[i]-'a'] + 32);
				}
				System.out.print(chars[i]);
			}
			System.out.println();
		}
	}

	private static char[] getPass(String word) {
		char []res = new char [26];
		boolean []flag = new boolean[26];
		char []chars = word.toUpperCase().toCharArray();
		List <Character> list = new ArrayList<Character>();
		for(char c : chars){
			if(!list.contains(c)){
				list.add(c);
				flag[c - 'A'] = true;
			}
			
		}
		int i = 0;
		for(char c : list){
			res[i++] = c;
		}
		for(int j = 0;j<26;j++){
			if(!flag[j]){
				res[i++] = (char) (j + 'A');
			}
		}
		
		return res;
	}

}
