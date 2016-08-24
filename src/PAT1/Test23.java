package PAT1;

/*import java.util.Scanner;

public class Test23 {

	*//**
	 * PAT ¾É¼üÅÌ´ò×Ö
	 *//*
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1=input.next();
		String s2=input.next();
		StringBuffer sb=new StringBuffer(s2);
		 if(s1.indexOf('+')!=-1){
	            //isShift=false;
	             s2=s2.replaceAll("[A-Z]","");
	             s1=s1.replaceAll("\\+","");
	        }
		s1=s1.toUpperCase();
		s2=sb.toString().toUpperCase();
		for(int i=0;i<s1.length();i++){
        	while(sb.indexOf(String.valueOf(s1.charAt(i)))!=-1){
        		sb.deleteCharAt(sb.indexOf(String.valueOf(s1.charAt(i))));
        	}
        }
		System.out.println(sb);
        
	}

}*/
import java.io.PrintStream;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
 
public class Test23 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
 
    public static void main(String[] args) throws ParseException {
        String badKey = in.next();
        String input = in.next();
        badKey = badKey.toLowerCase();
        HashSet<Character> badKeySet = new HashSet<>();
        for(int i=0;i<badKey.length();++i){
            badKeySet.add(badKey.charAt(i));
        }
         
        for(int i=0;i<input.length();++i){
             
            if(Character.isUpperCase(input.charAt(i))){
                if(!badKeySet.contains('+') && !badKeySet.contains((char)(input.charAt(i)+32))){
                    out.print(input.charAt(i));
                }
            }else if(!badKeySet.contains(input.charAt(i))){
                out.print(input.charAt(i));
            }
        }
                 
    }
}
 
