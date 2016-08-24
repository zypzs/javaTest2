package PAT1;

import java.util.Scanner;

public class Test3 {
/**
 * 
 * PAT ÊıËØÊı
 * @param args
 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int min=input.nextInt();
		int max=input.nextInt();
		int i=1,j=3;
		int []result=new int[max];
		result[0]=2;
		while(i<max){
			for(int k=2;;k++){
				if(j%k==0)
					break;
				if(k>=Math.sqrt(j)){
					result[i++]=j;
					break;
				}
			}
			j++;
		}
		int num=0;
		for(int m=min-1;m<max;m++){
			num++;
			if(num==10){
				System.out.println(result[m]);
				num=0;
			}	
			else if(m==max-1){
				System.out.print(result[m]);
			}else
				System.out.print(result[m]+" ");
		}
     
	}

}
