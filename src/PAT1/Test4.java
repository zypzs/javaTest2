package PAT1;
import java.util.Scanner;
/**
 * 
 * PAT福尔摩斯的约会
 * @author Administrator
 *
 */
public class Test4 {
		
	public static String[]week={"MON","TUE","WED","THU","FRI","SAT","SUN"};
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	String []lines=new String[4];
	for(int i=0;i<4;i++)
	lines[i]=input.nextLine();
	int len1=lines[0].length();
	int num=0;
	for(int i=0;i<len1;i++)
	{
	char c=lines[0].charAt(i);
	if(c==lines[1].charAt(i))
	{
	if(num==0&&Character.isLetter(c))
	{
	System.out.print(week[c-'A']+" ");
	num++;
	continue;
	}
	if(num==1)
	{
	if(Character.isLetter(c))
	{
	System.out.print((c-'A'+10)+":");
	break;
	}
	else if(Character.isDigit(c))
	{
	System.out.print("0"+c+":");
	break;
	}
	}
	}
	}
	int len2=lines[2].length();
	for(int i=0;i<len2;i++)
	{
	char c=lines[2].charAt(i);
	if(Character.isLetter(c)&&c==lines[3].charAt(i))
	{
	System.out.print(i<10?("0"+i):i);
	break;
	}
	}
	}
}
