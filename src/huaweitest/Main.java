package huaweitest;

import java.util.Scanner;

public class Main {

	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str  = scan.nextLine();
			StringBuilder sb = new StringBuilder("");
			for(int i=0;i<str.length();i++){
				if((str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') || str.charAt(i) == ' '){
					sb.append(str.charAt(i));
				}
			}
			System.out.println(sb.toString());
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tNum = 0;
		while(scan.hasNext()){
			String str  = scan.next();
			if("end".equals(str.trim())){
				System.out.println("current " + tNum);
				tNum = 0;
			}else{
				int temp = scan.nextInt();
				if("binding".equals(str.trim())){
				tNum += temp;
				}else{
					tNum = temp > tNum ? 0 : tNum-temp;
				}
			}
		}
	}
}
