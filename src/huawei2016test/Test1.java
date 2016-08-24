package huawei2016test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int m = scan.nextInt();
			int n = scan.nextInt();
			int []score = new int [m + 1];
			score[0] = 0;
			for(int i = 1;i <= m ;i++){
				score[i] = scan.nextInt();
			}
			for(int i = 0;i < n;i++){
				String s = scan.next();
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				if("Q" .equals(s)){
					System.out.println(getMax(num1,num2,score));
				}else if("U".equals(s)){
					update(num1,num2,score);
				}
			}
		}
		scan.close();
	}

	private static int [] update(int index, int newscore, int[] score) {
		score[index] = newscore;
		return score;
	}

	private static int  getMax(int from, int to,int []score) {
		int result = Integer.MIN_VALUE;
		if(to > score.length)
			to = score.length;
		if(from > to){
			int temp = to;
			to = from;
			from =temp;
		}
		for(int i = from;i <= to;i++){
			if(score[i] > result){
				result = score[i];
			}
		}
		return result;
	}
	

}
