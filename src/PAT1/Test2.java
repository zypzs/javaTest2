package PAT1;
import java.util.Scanner;

public class Test2 {
/**
 * 
 * PAT Êı×Ö·ÖÀà
 * @param args
 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int res[]={0,0,0,0,0};
		int num[]={0,0,0,0,0};
		for(int i=0;i<n;i++){
			int test=input.nextInt();
			switch(test%5){
			case 0:
				if(test%2==0){
					res[0]+=test;
					num[0]++;
				}
				
				break;
			case 1:
				num[1]++;
				if(num[1]%2==1)
					res[1]+=test;
				else
					res[1]-=test;
				break;
			case 2:
				res[2]++;
				num[2]++;
				break;
			case 3:
				res[3]+=test;
				num[3]++;
				break;
			case 4:
				if(test>res[4])
					res[4]=test;
				num[4]++;
				break;
				
			}
		}
		String result="";
		for(int i=0;i<5;i++){
			if(num[i]!=0)
			{
				if(i!=3)
				   result+=(String.valueOf(res[i])+" ");
				else{
					int x=(res[3])*100/num[3];
					if(x%10>=5)
						x=x+10;
					x=x/10;
					float y=(float)(x)/10;
					result+=(String.valueOf(y)+" ");
				}
			}
				
			else
				result+="N ";
		}
		System.out.println(result.trim());
	}
}
