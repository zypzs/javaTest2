package 华为机试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 查找兄弟单词 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int num = scan.nextInt();
			String []inputs = new String[num];
			for(int i=0;i<num;i++){
				inputs[i] = scan.next();
			}
			String test = scan.next();
			int index = scan.nextInt();
			int resultNum = 0;
			List<String> list = new ArrayList<String>();
			for(String str : inputs){
				if(isBro(str,test)){
					resultNum ++;
					list.add(str);
				}
			}
			Collections.sort(list);
			System.out.println(resultNum);
			if(list.size() >= index)
			System.out.println(list.get(index-1));
		}
	}

	private static boolean isBro(String str, String test) {
		if(str.length() != test.length() || str.equals(test)){
			return false;
		}else{
			char []strs = str.toCharArray();
			char []tests = test.toCharArray();
			Arrays.sort(strs);
			Arrays.sort(tests);
			return Arrays.equals(strs,tests);
 		}
	}

}
