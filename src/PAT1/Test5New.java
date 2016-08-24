package PAT1;
import java.util.Scanner;
import java.util.TreeSet;
public class Test5New {
	
	 /**
	  * 
	  * 
	  * PAT 德才论，来自别人的代码
	  */
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int n = input.nextInt();
	        int L = input.nextInt();
	        int H = input.nextInt();
	         
	        TreeSet<Stu> both = new TreeSet<Stu>();
	        TreeSet<Stu> dc1 = new TreeSet<Stu>();
	        TreeSet<Stu> dc2 = new TreeSet<Stu>();
	        TreeSet<Stu> dc3 = new TreeSet<Stu>();
	        while(n != 0){
	            Stu stu = new Stu(input.nextInt(), input.nextInt(), input.nextInt());
	            if(stu.d < L || stu.c <L){
	                n--;
	                continue;
	            }
	            if(stu.d >= H && stu.c >= H)
	                both.add(stu);
	            else if(stu.d >= H)
	                dc1.add(stu);
	            else if(stu.d >= stu.c)
	                dc2.add(stu);
	            else
	                dc3.add(stu);
	            n--;
	        }
	        System.out.println(both.size()+dc1.size()+dc2.size()+dc3.size());
	        print(both);
	        print(dc1);
	        print(dc2);
	        print(dc3);
	        input.close();
	         
	    }
	     
	    private static void print(TreeSet<Stu> set) {
	        for(Stu s : set)
	            System.out.println(s.id + " " + s.d + " " + s.c);
	    }
	 
	    static class Stu implements Comparable<Stu>{
	        int id, d, c, sum;
	        public Stu(int id, int d, int c) {
	            this.id = id;
	            this.d = d;
	            this.c = c;
	            this.sum = d+c;
	        }
	        @Override
	        public int compareTo(Stu o) {
	            if(this.sum != o.sum)
	                return o.sum-this.sum;
	            if(this.d != o.d)
	                return o.d-this.d;
	            return this.id-o.id;
	        }
	         
	    }

}
