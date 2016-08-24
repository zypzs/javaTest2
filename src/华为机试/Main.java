package »ªÎª»úÊÔ;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Set <Integer> set = new TreeSet<Integer>();
		Map <Integer,Integer> map = new TreeMap<Integer,Integer>();
		int num =20;
		    for(int i=0;i<num;i++){
		    	set.add((int)(Math.random()*100));
		    }
		    for(int i :set){
		    	System.out.print(i + " ");
		    }
		}
}
