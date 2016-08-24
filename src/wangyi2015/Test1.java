package wangyi2015;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int r = scan.nextInt();
			int avg = scan.nextInt();
			int []a = new int [n];
			int []b = new int [n];
			int current = 0;
			int res = 0;
			for(int i=0;i<n;i++){
				int ai = scan.nextInt();
				int bi = scan.nextInt();
				a[i] = ai;
	        	b[i] = bi;
	        	current += ai;
				insertSort(a,b,ai,bi,i);
			}
			if(current >= n*avg){
				System.out.println(res);
				return;
			}
			int k = 0;
			while(current < n*avg){
				if(a[k] < r){
					res += b[k];
				}else{
					res += b[++k];
					
							
				}
				a[k]++;
				current ++;
			}
			System.out.println(res);
		}
	}

	private static void insertSort(int[] a, int[] b, int ai, int bi,int i) {
        if(i == 0)
        	return;
		for(int j=i-1;j>=0;j--){
			if(b[j] > bi){
				b[j+1] = b[j];
				b[j] = bi;
				a[j+1] = a[j];
				a[j] = ai;
			}
		}
	}
}
