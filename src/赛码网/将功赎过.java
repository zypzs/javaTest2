package 赛码网;

import java.util.*;
public class 将功赎过 {
	private static int numberOf1(int n) {
         int result=0;
    	 while(n!=0){
    	   result++;
    	   n = (n-1)&n;
    	 }
    	 return result;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int l = scan.nextInt();
			int r = scan.nextInt();
			int m = scan.nextInt();
			int res = 0;
			for(int i = l;i <= r;i++){
				if(m == numberOf1(i)){
					res++;
				}
			}
			if(res == 0)
				System.out.println(-1);
			else
				System.out.println(res);
		}
	}

}
