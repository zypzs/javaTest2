package PAT1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test19 {

	/**
	 * PAT  ¾É¼üÅÌ
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1=input.next().toUpperCase();
		String s2=input.next().toUpperCase();
		Set<Character> set1=new HashSet<Character>();
		Set<Character> set2=new HashSet<Character>();
		for(int i=0;i<s1.length();i++){
			set1.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++){
			set1.remove(s2.charAt(i));
		}
		int res[]=new int[set1.size()];
		int i=0;
		Iterator<Character> ite = set1.iterator();
		while(ite.hasNext()){
			res[i]=s1.indexOf(ite.next());
			i++;
		}
		Arrays.sort(res);	
		for(int j=0;j<res.length;j++)
		System.out.print(s1.charAt(res[j]));
        System.out.println();
	}

}
