package 华为机试;

import java.util.Scanner;

public class 统计兔子总数 {

	public static int getTotalCount(int monthCount)
    {
		if(monthCount <= 2){
			return 1;
		}
		return getTotalCount(monthCount-1) + getTotalCount(monthCount-2);
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int num = scan.nextInt();
			System.out.println(getTotalCount(num));
		}
	}

}
