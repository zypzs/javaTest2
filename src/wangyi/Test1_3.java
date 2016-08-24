package wangyi;

import java.util.Scanner;
public class Test1_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m,k;
		int [][]arr;
		while(input.hasNext()){
			n = input.nextInt();
			m = input.nextInt();
			if (n < 3)
				n = 3;
			if (m < 3)
				m = 3;
			k = input.nextInt();
			arr = new int[n][m];
			for(int i=0;i<k;i++){
				arr[input.nextInt()-1][input.nextInt()-1]++;
			}
			System.out.println(scan(arr)+scan(arr));
		}
	}

	private static int scan(int[][] arr) {
		int res = 0;
		int n = arr.length;
		int m = arr[0].length;
		int k=0,w=0;
		for(int i=0; i<n-2;i++){
			for(int j=0;j<m-2;j++){
				int num =0;
				for(int u=i;u<i+3;u++)
					for(int v=j;v<j+3;v++){
						if(arr[u][v]>0)
							num++;
					}
				if(num > res){
					res = num;
					k = i;
					w = j;
				}
			}
		}
		for(int u=k;u<k+3;u++)
			for(int v=w;v<w+3;v++){
				if(arr[u][v]>0)
					arr[u][v]--;
			}
		return res;
		
	}

}
