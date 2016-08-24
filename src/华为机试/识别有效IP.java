package 华为机试;
import java.util.*;
public class 识别有效IP {
	    public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        int a=0,b=0,c=0,d=0,e=0,f=0,g=0;
	        while(in.hasNext()){
	            int flag=0;
	            String str=in.nextLine();
	            String[] s=str.split("~");
	            String[] ss1=s[0].split("\\.");
	            String[] ss2=s[1].split("\\.");
	            if(ss1.length!=4||ss2.length!=4){
	                f++;
	                continue;
	            }
	            for(int i=0;i<4;i++)
	            {
	                if(Integer.parseInt(ss1[i])<0||Integer.parseInt(ss1[i])>255)
	                {f++;break;}
	            }
	            int mask=Integer.parseInt(ss2[0]);
	            for(int i=1;i<4;i++)
	            {
	                mask=mask<<8;
	                mask=mask+Integer.parseInt(ss2[i]);
	            }
	            if((mask-1|mask)!=0xffffffff||mask==0xffffffff)
	                {f++;flag=1;}
	            int ss=Integer.parseInt(ss1[0]);
	            int s1=Integer.parseInt(ss1[1]);
	            if(ss>=1&&ss<=126&&flag==0)
	                {
	                a++;
	                if(ss==10&&flag==0)
	                g++;
	            }
	            else if(ss>=128&&ss<=191&&flag==0)
	                {
	                    b++;
	                    if(ss==172&&s1>=16&&s1<=31)
	                    {
	                        g++;
	                    }
	            }
	                 
	            else if(ss>=192&&ss<=223&&flag==0)
	                {
	                c++;
	                if(ss==192&&s1==168)
	                    g++;
	            }
	            else if(ss>=224&&ss<=239&&flag==0)
	                d++;
	            else if(ss>=240&&ss<=255&&flag==0)
	                e++;
	             
	        }
	        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g); 
	    }
}
