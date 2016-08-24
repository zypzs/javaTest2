package »ªÎª»úÊÔ;

import java.util.Scanner;
public class ×Ö·û´®ÅÅÐò {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			char []strs = scan.nextLine().toCharArray();
			char []res = new char[strs.length];
			char []temp = new char[strs.length];
			boolean []flag = new boolean[strs.length];
			int j = 0;
			for(int i=0;i<strs.length;i++){
				if(!isChar(strs[i])){
					res[i] = strs[i];
					flag[i] = true;
				}else{
					temp[j++] = strs[i];
					comp(temp,j);
				}
			}
			j = 0;
			for(int i=0;i<res.length;i++){
				if(flag[i])
					continue;
				else{
					res[i] = temp[j++];
				}
			}
			System.out.println(String.valueOf(res));
		}
	}

	 public static boolean isChar(char c){
		 if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			 return true;
		 return false;
	 }
	 public static void comp(char []temp,int j){
		 if(! isChar(temp[j-1]))
			 return;
		 char mid = temp[j-1] > 'Z' ? temp[j-1] : (char)(temp[j-1] + 32);
		 char c = temp[j-1];
		 for(int i=j-2;i>=0;i--){
			 if(temp[i] >= 'a' && temp[i] <= 'z'){
				 if(temp[i] > mid){
					 temp[i+1] = temp[i];
					 temp[i] = c;
				 }else{
					 break;
				 }
			 }else if(temp[i] >= 'A' && temp[i] <= 'Z'){
				 if(temp[i] + 32 > mid){
					 temp[i+1] = temp[i];
					 temp[i] = c;
				 }else{
					 break;
				 }
			 }
		 }
	 }
}
