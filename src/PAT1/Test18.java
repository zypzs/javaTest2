package PAT1;

import java.util.Scanner;

public class Test18 {

	/**
	 * PAT ÈË¿ÚÆÕ²é
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int result=0;
		String res_max="",res_min="";
		float max=0,min=201;
		for(int i=0;i<num;i++){
			String name=input.next();
			String str=input.next();
			float res=operate(str);
			if(res<0)
				continue;
			result++;
			if(res>max){
				max=res;
				res_max=name;
			}
			if(res<min){
				min=res;
				res_min=name;
			}
			
		}
		System.out.println(result+" "+res_max+" "+res_min);

	}

	private static float operate(String str) {
		String s[]=str.split("/");
		int y,m,d,y1,m1,d1;
		y1=Integer.valueOf(s[0]);
		m1=Integer.valueOf(s[1]);
		d1=Integer.valueOf(s[2]);
		d=6-d1;
		if(d<0){
			d+=30;
			m1--;
		}
		m=9-m1;
		if(m<0){
			m+=12;
			y1--;
		}
		y=2014-y1;
		float r=(float) (y+m/100.0+d/10000.0);
		if(r>200.0 || r<0){
			return -1;
		}
		return r;
	}
}
