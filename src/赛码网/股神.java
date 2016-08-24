package ÈüÂëÍø;

import java.util.Scanner;

public class ¹ÉÉñ {
	private static int getM(int n){
		int i=(int) Math.sqrt(n*2);
		for(;i*(i+3)+1>n*2;i--);
		return i;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int res = 0;
			int i = getM(n);
			res = i*(i-1)/2+1;
			res += (n-i*(i+3)/2-1);
			System.out.println(res);
		}
	}

}
