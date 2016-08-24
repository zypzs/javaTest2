package PAT1;

import java.util.Scanner;

public class Test17 {

	/**
	 * PAT´òÓ¡É³Â©
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		String s=input.next();
		int n=(int) Math.sqrt((num+1)/2);

		for(int i=0;i<n;i++){
			int j=i;
			while(j>0){
				System.out.print(" ");
				j--;
			}
			for(j=0;j<2*(n-i)-1;j++)
				System.out.print(s);
			System.out.println();
		}
		for(int i=n-2;i>=0;i--){
			int j=i;
			while(j>0){
				System.out.print(" ");
				j--;
			}
			for(j=0;j<2*(n-i)-1;j++)
				System.out.print(s);
			System.out.println();
		}
        System.out.println(num-(n*n*2-1));
	}

}
