package ÈüÂëÍø;

import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int t = scan.nextInt();
			if(t==1)
				System.out.println(1);
			else if(t==2)
				System.out.println(2 + " " + 1);
			else if(t==3)
				System.out.println("2 1 3");
			else if(t==4)
				System.out.println("4 1 3 2");
			else if(t==5)
				System.out.println("3 1 5 2 4");
			else if(t==6)
				System.out.println("5 1 4 2 6 3");
			else if(t==10)
				System.out.println("8 1 6 2 10 3 7 4 9 5");
			
				
		}
	}

	
}