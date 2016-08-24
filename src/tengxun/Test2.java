package tengxun;

import java.util.Scanner;
public class Test2 {
	/*
	 * 在不申请额外空间的前提下，实现字符大小写排序
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String s = input.nextLine();
			char []str = s.toCharArray();
			for(int i = 0; i<str.length;i++){
				for(int j=str.length-1 ; j>i;j--){
					if(str[j] > 96 && str[j-1] < 96){
						swap(str,j,j-1);
					}
				}
			}
			System.out.println(new String(str));
		}
	}

	private static void swap(char[] str, int j, int i) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
}
