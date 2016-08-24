package PAT1;
/*
import java.util.Scanner;
*//**
 * 
 * PAT A+BºÍC
 * @author Administrator
 *
 *//*
public class Test1 {
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		while(input.hasNext()){
			int n=input.nextInt();
			for(int i=0;i<n;i++){
					System.out.println("Case #"+(i+1)+": "+(input.nextLong()+input.nextLong()>input.nextLong()));				
			}
		}		
	}
}
*/
public class Test1
{
    public static void main(String[] args)
    {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.print(n1 == n2);
        System.out.print(",");
        System.out.println(n1 != n2);
    }
}