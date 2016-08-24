package huawei;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int j=0;
		while(input.hasNext()){
			int test=input.nextInt();
			
			if(test==0 ||j==10){
				break;
			}
			int num1=0;
			while(test/3>0){
				num1+=(test/3);
				test=(test/3)+(test%3);
			}
			if(test==2){
				num1++;
			}
			j++;
			System.out.println(num1);
		}		
      
	}
}
