package PAT1;

import java.util.Scanner;

public class Test16 {

	/**
	 * PAT ��������ʱ��
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int min=input.nextInt();
		int max=input.nextInt();
		//���Կ���������ĺ���
		 int time = (int) Math.round((max-min)/100.0);
		/*int time=(max-min)/10;
		time=time%10>=5?(time+10)/10:time/10;*/
		String h=String.valueOf(time/3600);
		String m=String.valueOf((time%3600)/60);
		String s=String.valueOf(time%60);
		if(time/3600<10)
			h="0"+h;
		if((time%3600)/60<10)
			m="0"+m;
		if(time%60<10)
			s="0"+s;
		System.out.println(h+":"+m+":"+s);
	}

}
