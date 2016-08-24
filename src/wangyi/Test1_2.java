package wangyi;

import java.util.Scanner;

public class Test1_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []arr = new int[9];
		int []len = new int[3];
		int res;
		while(input.hasNext()){
		
			res = 0;
		for(int i=0;i<9;i++){
			arr[i] = input.nextInt();
		}
		int r = arr[0]*arr[0];
		 len[0] = (arr[1]-arr[7])*(arr[1]-arr[7]) + (arr[2]-arr[8])*(arr[2]-arr[8]);
		 len[1] = (arr[3]-arr[7])*(arr[3]-arr[7]) + (arr[4]-arr[8])*(arr[4]-arr[8]);
		 len[2] = (arr[5]-arr[7])*(arr[5]-arr[7]) + (arr[6]-arr[8])*(arr[6]-arr[8]);
		for(int i=0;i<3;i++){
			if(r >= len[i]){
				res++;
			}
		}
		if(res == 0)
			System.out.println("0x");
		else
			System.out.println(res+"x");
		}
	}
}
