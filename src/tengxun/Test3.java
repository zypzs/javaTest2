package tengxun;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int n = input.nextInt();
			int []arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = input.nextInt();
			}
			Arrays.sort(arr);
			int num1 = 0,num2 = n-1;
			while(num1 < n){
				if(arr[num1] == arr[0])
					num1++;
				else
					break;
			}
			while(num2 >=0 ){
				if(arr[num2] == arr[num2-1])
					num2--;
				else
					break;
			}
			int []num = new int[n-1];
			for(int i=0;i<n-1;i++){
				num[i] = arr[i+1] - arr[i];
			}
			Arrays.sort(num);
			int res2 = 0;
			while(res2 < n-1){
				if(num[res2] == num[0])
					res2++;
				else 
					break;
			}
			int res1 = num1 * (n - num2 + 1);
			System.out.println(Arrays.toString(arr));
			System.out.println(res1+ " " + res2);
		}
	}
}
	
