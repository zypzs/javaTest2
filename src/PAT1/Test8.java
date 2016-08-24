package PAT1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test8 {

	/**
	 * PAT ´¸×Ó¼ôµ¶²¼
	 */
	/*public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Map <Character,Integer> map1=new HashMap<Character,Integer>();
		Map <Character,Integer> map2=new HashMap<Character,Integer>();
		Map <Character,Integer> map3=new HashMap<Character,Integer>();
		map1.put('B', 0);
		map1.put('C', 0);
		map1.put('J', 0);
		map2.put('B', 0);
		map2.put('C', 0);
		map2.put('J', 0);
		map3.put('B', 0);
		map3.put('C', 0);
		map3.put('J', 0);
		int n=input.nextInt();
		for(int i=0;i<n;i++){
			char c1=input.next().charAt(0);
			char c2=input.next().charAt(0);
			int num1=map1.get(c1);
			int num2=map2.get(c2);
			int num3=map3.get(c1);
			
			if(c1==c2){
				num3++;
				map3.put(c1, num3);
			}else if((c1=='C'&&c2=='J')||(c1=='J'&&c2=='B')||(c1=='B'&&c2=='C')){
				num1++;
				map1.put(c1, num1);
			}else{
				num2++;
				map2.put(c2, num2);
			}
		}
		int res1=map1.get('C')+map1.get('B')+map1.get('J');
		int res2=map2.get('C')+map2.get('B')+map2.get('J');
		int res3=map3.get('C')+map3.get('B')+map3.get('J');
		char max1='B';
		char max2='B';
		if(map1.get('C')>map1.get(max1))
			max1='C';
		if(map1.get('J')>map1.get(max1))
			max1='J';
		if(map2.get('C')>map2.get(max1))
			max2='C';
		if(map2.get('J')>map2.get(max1))
			max2='J';
		System.out.println(res1+" "+res3+" "+res2);
		System.out.println(res2+" "+res3+" "+res1);
        System.out.println(max1+" "+max2);
	}*/
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int res1[]={0,0,0},res2[]={0,0,0};//0:B;1:C;2:J
		for(int i=0;i<n;i++){
			char c1=input.next().charAt(0);
			char c2=input.next().charAt(0);
			if(c1=='B'){
				if(c2=='C'){
					res1[0]++;
				}else if(c2=='J'){
					res2[2]++;
				}
			}else if(c1=='C'){
				if(c2=='J'){
					res1[1]++;
				}else if(c2=='B'){
					res2[0]++;
				}
			}else{
				if(c2=='B'){
					res1[2]++;
				}else if(c2=='C'){
					res2[1]++;
				}
			}
		}
		int num1=res1[0]+res1[1]+res1[2];
		int num2=res2[0]+res2[1]+res2[2];
		char max1='B';int x=res1[0];
		if(res1[1]>x){
			max1='C';
			x=res1[1];
		}			
		if(res1[2]>x){
			max1='J';
			x=res1[2];
		}
		char max2='B';
		x=res2[0];
		if(res2[1]>x){
			max1='C';
			x=res2[1];
		}			
		if(res2[2]>x){
			max1='J';
			x=res2[2];
		}
		System.out.println(num1+" "+(n-num1-num2)+" "+num2);
		System.out.println(num2+" "+(n-num1-num2)+" "+num1);
		System.out.println(max1+" "+max2);
	}

}
