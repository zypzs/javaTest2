package baidu2017;

import java.util.Scanner;

public class Solution1 {

	public static String change(String s){
		char []res = new char[s.length()];
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) < 97){
				res[i] += (char)(s.charAt(i) + 32);
			}else
				res[i] += s.charAt(i) - 32;
		}
		return String.valueOf(res);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s = input.nextLine();
		int len = input.nextInt();
		String res = "";
		String []temp = s.split("\\s");
		for (int i = temp.length-1; i >= 0; i--) {
			res += change(temp[i]) + " ";
		}
		if(s.charAt(0) == 0)
			res += " ";
		if(s.endsWith(" "))
			res = " " + res;
		System.out.println();
	}
}
