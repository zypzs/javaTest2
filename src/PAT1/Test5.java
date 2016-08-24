package PAT1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Comparator; 
import java.util.TreeSet;

public class Test5 {

	/**
	 * PAT µ¬≤≈¬€
	 * 
	 *       ¥À÷÷∑Ω∑®‘À––≥¨ ±£°
	 */
	static Map<String, String> map1 = new HashMap<String, String>();
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		 Set<String> l1=new TreeSet<String>(
				 new Comparator<String>() {
	                    public int compare(String obj1, String obj2) {
	                        // Ωµ–Ú≈≈–Ú
	                        return obj2.compareTo(obj1);
	                    }
	                });
		 Set<String> l2=new TreeSet<String>(
				 new Comparator<String>() {
	                    public int compare(String obj1, String obj2) {
	                        // Ωµ–Ú≈≈–Ú
	                        return obj2.compareTo(obj1);
	                    }
	                });
		 Set<String> l3=new TreeSet<String>(
				 new Comparator<String>() {
	                    public int compare(String obj1, String obj2) {
	                        // Ωµ–Ú≈≈–Ú
	                        return obj2.compareTo(obj1);
	                    }
	                });
		 Set<String> l4=new TreeSet<String>(
				 new Comparator<String>() {
	                    public int compare(String obj1, String obj2) {
	                        // Ωµ–Ú≈≈–Ú
	                        return obj2.compareTo(obj1);
	                    }
	                });
         int n=input.nextInt();
         int l=input.nextInt();
         int h=input.nextInt();
         int m=n;
         for(int i=0;i<n;i++){
        	 int num=input.nextInt();
        	 int de=input.nextInt();
        	 int cai=input.nextInt();
        	 if(de<l || cai<l){
        		 m--;
        		 continue;
        	 }
        		 
        	 if(de>=h && cai>=h)
        		 l1.add((de+cai)+""+de+"-"+num);
        	 else if(de>=h && cai<h)
        		 l2.add((de+cai)+""+de+"-"+num);
        	 else if(de<h && cai<h &&de>cai)
        		 l3.add((de+cai)+""+de+"-"+num);
        	 else
        		 l4.add((de+cai)+""+de+"-"+num);
        	 map1.put((de+cai)+""+de+"-"+num,num+" "+de+" "+cai);
         }
         System.out.println(m);
         prints(l1);
         prints(l2);
         prints(l3);
         prints(l4);
		 
	}

	private static void prints(Set<String> l1) {
		Iterator ite =  l1.iterator();  
		 String s[]=new String[l1.size()];
		  int i=0;
	        while (ite.hasNext()) {
	            String key = "";
	            s[i]=(String) ite.next();
	           
	            if(i>0){
	            	if(compare(s[i-1],s[i])){
	  	        	  key=s[i];
	  	        	  s[i]=s[i-1];
	  	        	  s[i-1]=key;
	  	          }
	            }
	          
	          i++;
	        }
	        for(int j=0;j<s.length;j++)
	        	System.out.println(map1.get(s[j]));
			
		
	}

	private static boolean compare(String s1, String s2) {
		String arr1[]=s1.split("-");
		String arr2[]=s2.split("-");
		if(arr1[0].equals(arr2[0]) &&(Integer.valueOf(arr1[1])>Integer.valueOf(arr2[1])))
	      return true;
		else
			return false;
		
	}

}
