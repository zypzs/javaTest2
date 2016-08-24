package ��Ϊ����;

import java.util.Scanner;

public class �ϳ���1 {

    private static int []dpLeft (int []arr){
		int []dp = new int [arr.length];
		for(int i=0;i<arr.length;i++){
			dp[i] = 1;
			for(int j=0;j<i;j++){
				if(arr[i] > arr[j])
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
		}
		return dp;
	}
	private static int []dpRight (int []arr){
		int []dp = new int [arr.length];
		for(int i=arr.length-1;i>=0;i--){
			dp[i] = 1;
			for(int j=i;j<arr.length;j++){
				if(arr[i] > arr[j])
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
				
		}
		return dp;
	}
     
    public static void main(String[] args) {
  
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int n=cin.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=cin.nextInt();
            }
             
            int left[]=dpLeft(arr);
            int right[]=dpRight(arr);
             
            int max=0;
            //���ÿ��λ�÷��Ϻϳ��Ӷ��εĳ��ȣ�����¼��ģ�ʱ�临�Ӷ�O��n��
            for(int i=0;i<n-1;i++){
                int k=left[i]+right[i]-1;
                max=Math.max(max, k);
            }
             
            System.out.println(n-max);
        }
         
    }

}
